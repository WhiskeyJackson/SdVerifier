package fileVerification;

import java.io.IOException;
import java.util.ArrayList;

import commandExecutor.CommandExecutor;

public class DdCard {
	public DdCard(){
	}

	public void runDD(String imageName) throws IOException, InterruptedException{


		CommandExecutor cmex = new CommandExecutor();
		ArrayList<String> ddParts = new ArrayList<String>();

		ddParts.add("ddrescue");
		ddParts.add("/dev/mmcblk0");
		ddParts.add(imageName + ".img");
		ddParts.add(imageName + ".txt");

		cmex.execute(ddParts);

	}
}
