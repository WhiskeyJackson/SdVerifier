package fileVerification;

import java.io.IOException;
import java.util.ArrayList;

import commandExecutor.CommandExecutor;

public class DdCard {
	public DdCard(){
	}

	public void runDD() throws IOException, InterruptedException{

		String imageName = "somethingmeaningful";

		CommandExecutor cmex = new CommandExecutor();
		ArrayList<String> ddParts = new ArrayList<String>();

		ddParts.add("dd");
		ddParts.add("if=/dev/mmcblk0");
		ddParts.add("of=" + imageName + ".img");
		ddParts.add("conv=noerror,sync");

		String response = cmex.execute(ddParts);
		System.out.println(response);


	}
}
