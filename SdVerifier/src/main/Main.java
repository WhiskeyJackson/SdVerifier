package main;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import checkSums.CheckSumVerifier;
import fileVerification.MyFileVisitor;

public class Main {

	public static void main(String[] args) {
		String rootPath = "";
		String packageName = "";
		boolean runDd = false;

		try{

			rootPath = CommandlineVerifier.getRootPath(args);
			packageName = CommandlineVerifier.getPackage(args);
			runDd = CommandlineVerifier.runDd(args);

			//rootPath = "/media/nicholasf/8273-74F7/";
			//packageName = "12.6.3";

			CheckSumVerifier checksumVerifier = CheckSumVerifier.createCheckSumVerifierForPackage(packageName);

			System.out.println("Beginning check of " + rootPath + "*");
			Path path = Paths.get(rootPath);
			MyFileVisitor<Path> visitor = new MyFileVisitor<Path>(checksumVerifier);
			Files.walkFileTree(path, visitor);
			System.out.println("Finished Checking Card for Read Errors");

			if(runDd){
				System.out.println("Beginning DD of Card...");
				//dd card here
				System.out.println("Finished DD of Card...");
			}

		} catch (NoSuchFileException e) {
			System.out.println("Could Not Find Path " + rootPath);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
