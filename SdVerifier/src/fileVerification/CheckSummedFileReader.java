package fileVerification;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class CheckSummedFileReader {

	private final File file;
	private static final String CHECKSUM_TYPE = "MD5";

	public CheckSummedFileReader(File file) {
		this.file = file;
	}

	public String read(byte[] fileData) throws IOException{
		try {

			FileInputStream fis = new FileInputStream(file);
			MessageDigest md = MessageDigest.getInstance(CHECKSUM_TYPE);
			DigestInputStream digis = new DigestInputStream(fis, md);
			DataInputStream dis = new DataInputStream(digis);

			dis.readFully(fileData);
			byte[] digest = md.digest();

			fis.close();
			digis.close();
			dis.close();

			return DatatypeConverter.printHexBinary(digest);

		} catch (NoSuchAlgorithmException e) {
			throw new IOException("Could not calculate checksum of type " + CHECKSUM_TYPE);
		}
	}

}
