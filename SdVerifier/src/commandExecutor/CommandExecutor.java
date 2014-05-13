package commandExecutor;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CommandExecutor {

	private Process process;
	private InputStream inputStream;

	public String execute(ArrayList<String> command) throws IOException, InterruptedException{

		String commandString = "";
		for(int i = 0; i<command.size(); i++){
			commandString = commandString.concat(" " + command.get(i));
		}

		ProcessBuilder builder = new ProcessBuilder(command);

		System.out.println(commandString);
		process = builder.start();

		inputStream = process.getInputStream();

		if(process.waitFor() != 0 || process.exitValue() != 0){
			System.out.println("Command that failed: " + commandString);
			throw new IOException("Process terminated abnormally. Exit value: " + process.exitValue());
		}


		String response = readInputStream();

		return response;

	}

	private String readInputStream() throws IOException {
		String response = "";
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		int nRead;
		byte[] data = new byte[16384];

		while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
			buffer.write(data, 0, nRead);
		}

		response = buffer.toString();
		return response;
	}

}
