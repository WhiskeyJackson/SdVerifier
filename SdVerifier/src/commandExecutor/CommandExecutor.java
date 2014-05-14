package commandExecutor;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CommandExecutor {

	public void execute(ArrayList<String> command) throws IOException, InterruptedException{

		String commandString = "";
		for(int i = 0; i<command.size(); i++){
			commandString = commandString.concat(" " + command.get(i));
		}

		ProcessBuilder builder = new ProcessBuilder(command);

		System.out.println(commandString);
		Process process = builder.start();

		InputStream is = process.getInputStream();
		readInputStream(is);

		if(process.waitFor() != 0 || process.exitValue() != 0){
			System.out.println("Command that failed: " + commandString);
			throw new IOException("Process terminated abnormally. Exit value: " + process.exitValue());
		}

	}

	private void readInputStream(InputStream stream) throws IOException {
		InputStreamReader isr = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

}
