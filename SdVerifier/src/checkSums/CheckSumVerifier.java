package checkSums;



public class CheckSumVerifier {


	private final CheckSums sums;

	private CheckSumVerifier(CheckSums sums){
		this.sums = sums;
	}

	public void verifyFile(String fileName, String checksum){
		String pristineCheckSum = sums.get(fileName);
		if(pristineCheckSum != null){
			//System.out.println("Checking CheckSum of " + fileName);
			if(!pristineCheckSum.equals(checksum.toLowerCase())){
				System.out.println("Checksum failed for File: " + fileName);
			}
		}
	}

	public static CheckSumVerifier createCheckSumVerifierForPackage(String packageName){
		if(packageName.contains("12.6.0")){
			return new CheckSumVerifier(new CheckSums126());
		} else if (packageName.contains("12.6.23")) {
			return new CheckSumVerifier(new CheckSums12623());
		} else if (packageName.contains("12.4.3")) {
			return new CheckSumVerifier(new CheckSums1243());
		} else if (packageName.contains("12.4.0")) {
			return new CheckSumVerifier(new CheckSums1240());
		} else if (packageName.contains("12.5.3")) {
			return new CheckSumVerifier(new CheckSums1253());
		}else {
			return new CheckSumVerifier(new NoCheckSums());
		}
	}

}

