package checkSums;

import java.util.HashMap;
import java.util.Map;

public class CheckSums1240 implements CheckSums {
	//BlueScale12.4.0-20121211F

	Map<String,String> sums = new HashMap<String,String>();

	public CheckSums1240() {
		sums.put("4_15_0_21.manifest_52", "f72a0183ca4946c8e86e735749467e36");
		sums.put("eru.exe","fb64457fc94f70339b8ea67cd8fea95e");
		sums.put("FileInfo.txt","8c71bb6e338e929a622bbbab2e76e071");
		sums.put("$FLASH$","b65885f8dac163d810d256d3a6d2a0be");
		sums.put("files.lst","70e2c4eb001c44997ff64b4c213968dd");
		sums.put("FLR_R_3_20e.mot","0b504e8ee416a1607eba5ce3a5dadd1d");
		sums.put("mambaadi.exe","3f78fc6d84c2a17eca37e38f64a3ed08");
		sums.put("mambabgclient.exe","251cf4e93ec04cb78f70cd39eded4efd");
		sums.put("mambacanrtr.exe","ffd9a121dcb836bffcb2ee9349783a9e");
		sums.put("mambadcm.exe","6270c00b1577801e01940009b0e9cad6");
		sums.put("mambalcsrvr.exe","6944439afd84c38ccc21b9e3976ec6cc");
		sums.put("mambaloglib.exe","05e3dbc7d29ecc5bd1bc7f920a2d63fb");
		sums.put("mambamotion.exe","5776dada7321bf3aada0b53f29443e75");
		sums.put("mambatests.exe","d291df72adb9150508797d458a161b84");
		sums.put("mambawebsrvr.exe","1197e61cde778c2b19108af1b1bcd8bd");
		sums.put("mambaxlmsrvr.exe","428265c98835f23e992ab60b262d1b15");
		sums.put("McApi.dll.new","81d6f23d30ffbf133b7f2cdde5e331f7");
		sums.put("nk.bin","35d31f145af9a6ced89d6de42d07e39b");

	}

	@Override
	public String get(String fileName){
		return sums.get(fileName);
	}

}
