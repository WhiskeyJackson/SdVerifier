package fileVerification;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import checkSums.CheckSumVerifier;

public class MyFileVisitor<T> extends SimpleFileVisitor<Path>{

	private final CheckSumVerifier checkSumVerifier;
	private final AsciiVerifier asciiVerifier;

	public MyFileVisitor(CheckSumVerifier checksumVerifier, AsciiVerifier asciiVerifier) {
		this.checkSumVerifier = checksumVerifier;
		this.asciiVerifier = asciiVerifier;
	}

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {

		try{

			String fileName = path.getFileName().toString();
			File file = path.toFile();

			CheckSummedFileReader csfr = new CheckSummedFileReader(file);
			byte[] fileData = new byte[(int) file.length()];
			String checksum = csfr.read(fileData);

			checkSumVerifier.verifyFile(fileName, checksum);

			if((fileName.endsWith(".log") && !fileName.contains("cedevice")) || fileName.endsWith(".adt") || fileName.endsWith(".xml")
					|| fileName.endsWith(".txt") || fileName.endsWith(".mtr") || fileName.endsWith(".llt")){
				asciiVerifier.verify(file.getAbsolutePath(), fileData);
			}


		}catch (IOException ioe){
			System.err.println("Could Not Open File: " + path.getFileName() + ": " + ioe.getMessage());
		}
		return FileVisitResult.CONTINUE;

	}
}