package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import checkSums.CheckSumVerifier;
import fileVerification.AcceptAllAsciiVerifier;
import fileVerification.AsciiVerifier;
import fileVerification.DdCard;
import fileVerification.LogAsciiVerifier;
import fileVerification.MyFileVisitor;

public class Main {

	public static void main(String[] args) {
		String rootPath = "";
		String packageName = "";
		boolean runDd = false;
		boolean checkAscii = false;

		try{

			rootPath = CommandlineParser.getRootPath(args);
			packageName = CommandlineParser.getPackage(args);
			runDd = CommandlineParser.runDd(args);
			checkAscii = CommandlineParser.checkForAscii(args);

			//rootPath = "/media/nicholasf/8273-74F7/";
			//packageName = "12.6.3";

			CheckSumVerifier checksumVerifier = CheckSumVerifier.createCheckSumVerifierForPackage(packageName);
			AsciiVerifier asciiVerifier;

			if(checkAscii == true){
				asciiVerifier = new LogAsciiVerifier();
			} else {
				asciiVerifier = new AcceptAllAsciiVerifier();
			}

			System.out.println("Beginning check of " + rootPath + "*");
			readFileSystem(rootPath, checksumVerifier, asciiVerifier);
			System.out.println("Finished Checking Card for Read Errors");

			if(runDd){
				System.out.println("Beginning DD of Card...");
				DdCard dder = new DdCard();
				dder.runDD();
				System.out.println("Finished DD of Card.");
			}

		} catch (NoSuchFileException e) {
			System.out.println("Could Not Find Path " + rootPath);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	private static void readFileSystem(String rootPath, CheckSumVerifier checksumVerifier, AsciiVerifier asciiVerifier) throws IOException {
		Path path = Paths.get(rootPath);
		MyFileVisitor<Path> visitor = new MyFileVisitor<Path>(checksumVerifier, asciiVerifier);
		Files.walkFileTree(path, visitor);
	}

}
