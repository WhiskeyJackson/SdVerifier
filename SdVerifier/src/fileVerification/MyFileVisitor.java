package fileVerification;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

import checkSums.CheckSumVerifier;

public class MyFileVisitor<T> extends SimpleFileVisitor<Path>{

	private final CheckSumVerifier checkSumVerifier;

	public MyFileVisitor(CheckSumVerifier checksumVerifier) {
		this.checkSumVerifier = checksumVerifier;
	}

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {

		try{

			String fileName = path.getFileName().toString();
			File file = path.toFile();

			byte[] fileData = new byte[(int) file.length()];
			FileInputStream fis = new FileInputStream(file);
			MessageDigest md = MessageDigest.getInstance("MD5");
			DigestInputStream digis = new DigestInputStream(fis, md);
			DataInputStream dis = new DataInputStream(digis);
			//System.out.println("Reading " + fileName);

			dis.readFully(fileData);
			byte[] digest = md.digest();

			if(  (fileName.endsWith(".log") && !fileName.contains("cedevice")) || fileName.endsWith(".adt")
					|| fileName.endsWith(".xml") || fileName.endsWith(".txt")){
				//System.out.println("Checking ASCII of " + fileName);
				AsciVerifier verifier = new AsciVerifier(file.getAbsolutePath(), fileData);
				verifier.verify();
			}

			checkSumVerifier.verifyFile(fileName, DatatypeConverter.printHexBinary(digest));

			fis.close();
			dis.close();

		}catch (IOException ioe){
			System.err.println("Could Not Open File: " + path.getFileName() + ": " + ioe.getMessage());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;

	}
}