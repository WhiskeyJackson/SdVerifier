package checkSums;

import java.util.HashMap;
import java.util.Map;

public class CheckSums1253 implements CheckSums {
	//BlueScale12.5.3-20130618F

	Map<String,String> sums = new HashMap<String,String>();

	public CheckSums1253() {
		sums.put("4_15_0_21.manifest_52", "24fd61987fefda10a761f1f264543a5a");
		sums.put("eru.exe","ebf087f491a6558b7df173e298adb532");
		sums.put("FileInfo.txt","31b08102de42a6064cc6a3ece1df5ed1");
		sums.put("$FLASH$","b65885f8dac163d810d256d3a6d2a0be");
		sums.put("files.lst","8a563575ff7663b32d736b9346f1fc5c");
		sums.put("FLR_R_3_20e.mot","0b504e8ee416a1607eba5ce3a5dadd1d");
		sums.put("mambaadi.exe","eefa686557a03ab0c77b89b74e788cdf");
		sums.put("mambabgclient.exe","bd2c6daee0dc50b72b3333e4d121eaae");
		sums.put("mambacanrtr.exe","c95f0e0466c7bd36dc557a8d2b88b85b");
		sums.put("mambadcm.exe","88422d1c174f7f810a73a9dbb2c9721a");
		sums.put("mambalcsrvr.exe","fc1b1684b53fa20a27a1ec7b8d54b4cc");
		sums.put("mambaloglib.exe","d98b4603c7371b72e3d1535222bd1320");
		sums.put("mambamotion.exe","45811d3342000de68a7d31c467a730e9");
		sums.put("mambatests.exe","f0a7bd58b9ff0abc1e2998f2396302da");
		sums.put("mambawebsrvr.exe","2cbc7224de2b194f1066cc9268d4e580");
		sums.put("mambaxlmsrvr.exe","55cfd74132501c61b0b6c7317fbacee6");
		sums.put("McApi.dll.new","81d6f23d30ffbf133b7f2cdde5e331f7");
		sums.put("nk.bin","35d31f145af9a6ced89d6de42d07e39b");

	}

	@Override
	public String get(String fileName){
		return sums.get(fileName);
	}

}

