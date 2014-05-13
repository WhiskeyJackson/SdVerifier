package checkSums;

import java.util.HashMap;
import java.util.Map;

public class CheckSums1243 implements CheckSums {
	//BlueScale12.4.3-20130125F
	Map<String,String> sums = new HashMap<String,String>();

	public CheckSums1243() {
		sums.put("4_15_0_21.manifest_52", "f72a0183ca4946c8e86e735749467e36");
		sums.put("eru.exe","9971023b9234c72a332efc0382dd0479");
		sums.put("FileInfo.txt","336607f1facd2ad2a3a47c71e384ec67");
		sums.put("$FLASH$","b65885f8dac163d810d256d3a6d2a0be");
		sums.put("files.lst","5c0cfc83bbd38c990eca572b239cb112");
		sums.put("FLR_R_3_20e.mot","0b504e8ee416a1607eba5ce3a5dadd1d");
		sums.put("mambaadi.exe","3f78fc6d84c2a17eca37e38f64a3ed08");
		sums.put("mambabgclient.exe","1e1d9bcad8b5b1400b81294a517141e3");
		sums.put("mambacanrtr.exe","7354ea5eab731d46bc9dd15fff5ab15b");
		sums.put("mambadcm.exe","6270c00b1577801e01940009b0e9cad6");
		sums.put("mambalcsrvr.exe","1796e3d17a080be2c3551363ebd88b69");
		sums.put("mambaloglib.exe","06e9d4a49e01b69d05e84e6d15e0eba1");
		sums.put("mambamotion.exe","ae42575fd72646e874fa2af7cba4e0a1");
		sums.put("mambatests.exe","9090c7cb95a6153a2aab5d87d8314bbc");
		sums.put("mambawebsrvr.exe","da9de959d0b6b19c46d6fc5d6a47b8be");
		sums.put("mambaxlmsrvr.exe","754f76721e4e37864d627886691cf575");
		sums.put("McApi.dll.new","81d6f23d30ffbf133b7f2cdde5e331f7");
		sums.put("nk.bin","35d31f145af9a6ced89d6de42d07e39b");

	}

	@Override
	public String get(String fileName){
		return sums.get(fileName);
	}

}
