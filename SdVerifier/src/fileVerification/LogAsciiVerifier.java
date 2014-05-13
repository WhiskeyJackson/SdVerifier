package fileVerification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogAsciiVerifier implements AsciiVerifier{

	@Override
	public void verify(String fileName, byte[] fileData){
		Pattern pattern = Pattern.compile("([\\x00-\\x08]|[\\x0B-\\x0C]|[\\x0E-\\x1F]|[\\x80-\\xFF])");


		Matcher matcher = pattern.matcher(new String(fileData));

		if(matcher.find()){
			System.out.println("Non-Ascii characters found in " + fileName);
			System.out.print("character at " + matcher.start());
			while(matcher.find()){
				System.out.print(", " + matcher.start());
			}
			System.out.print("\n");
		}


	}

}
