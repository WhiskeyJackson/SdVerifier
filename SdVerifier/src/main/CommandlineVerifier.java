package main;

public class CommandlineVerifier {

	public static String getRootPath(String[] args) {

		for(String arg: args){
			if(arg.contains("/")){
				return arg;
			}
		}
		throw new IllegalArgumentException("Must specify root directory to verify, Ya Dingus");
	}

	public static String getPackage(String[] args){
		for(String arg: args){
			if(arg.contains("12.")){
				return arg;
			}
		}
		return "no package";
	}

	public static boolean runDd(String[] args) {
		for(String arg: args){
			if(arg.contains("-dd")){
				return true;
			}
		}
		return false;
	}

}
