package checkSums;

import java.util.HashMap;
import java.util.Map;

public class CheckSums126 implements CheckSums {
	//BlueScale12.6.0-20130817F
	Map<String,String> sums = new HashMap<String,String>();

	public CheckSums126() {
		sums.put("4_15_0_21.manifest_52", "af0d560ec21dcbf391b1fcd22fccc712");
		sums.put("eru.exe","6641facf246215e6b8991387d7e5eb1a");
		sums.put("FileInfo.txt","8df47f393252de12d53f78271ef9443b");
		sums.put("$FLASH$","b65885f8dac163d810d256d3a6d2a0be");
		sums.put("files.lst","38b7748693b6eb9c4a634c3526fc642d");
		sums.put("FLR_R_3_20e.mot","0b504e8ee416a1607eba5ce3a5dadd1d");
		sums.put("mambaadi.exe","584db839ef19780292ce3bc78aa951a9");
		sums.put("mambabgclient.exe","5f4297f12a9ed274c10ed095b993084b");
		sums.put("mambacanrtr.exe","264ca2cb99ec3bbfd17a9e6fc44e8506");
		sums.put("mambadcm.exe","f2b20c086937a1757340d673fe287858");
		sums.put("mambalcsrvr.exe","0b911ae80458034360b0f166df5d5d8d");
		sums.put("mambaloglib.exe","dcb7eefc565656eb026664c9fca52cc4");
		sums.put("mambamotion.exe","e40214e29d3ec51904fdfbac9b536696");
		sums.put("mambatests.exe","fb89cf0afa5fdf8a8664bb0d001917ea");
		sums.put("mambawebsrvr.exe","d7d04babf188a7c1f810bc7c748017af");
		sums.put("mambaxlmsrvr.exe","cc3ebae79e75fcdfce2ddc49a5b36acb");
		sums.put("McApi.dll.new","81d6f23d30ffbf133b7f2cdde5e331f7");
		sums.put("nk.bin","35d31f145af9a6ced89d6de42d07e39b");

	}

	@Override
	public String get(String fileName){
		return sums.get(fileName);
	}

}
