package checkSums;

import java.util.HashMap;
import java.util.Map;

public class CheckSums12623 implements CheckSums {

	//CheckSums for 12.6.3-20140325F

	Map<String,String> sums = new HashMap<String,String>();

	public CheckSums12623() {
		sums.put("4_15_0_21.manifest_52", "83821b73a3b8346083c7988e4dc5e1d1");
		sums.put("eru.exe","62cc623a32768d5e480ff325b88e45ca");
		sums.put("FileInfo.txt","21f13f3a48d0766cf5c2f245ca7d4f43");
		sums.put("$FLASH$.rom","2f29d5a333dff8433c092ca19c8efaae");
		sums.put("files.lst","19715faeaeb725a53a4cd41c760f0fd9");
		sums.put("FLR_R_3_20e.mot","0b504e8ee416a1607eba5ce3a5dadd1d");
		sums.put("mambaadi.exe","33cdb2e6e600b2d609bfa482d70a8272");
		sums.put("mambabgclient.exe","31486b6176af2b1c61c71a9112ac1f1a");
		sums.put("mambacanrtr.exe","4306c80e440ec0e70e661a7cfeb6a8f7");
		sums.put("mambadcm.exe","a080f3d10719220669931fb6f6b031fc");
		sums.put("mambalcsrvr.exe","08ca5542e282e54ed4a8ccec0a9c9414");
		sums.put("mambaloglib.exe","6d51b81013543a7af86dd26ad3310e60");
		sums.put("mambamotion.exe","caff526b6301f2766875d0cf13ec51e1");
		sums.put("mambatests.exe","30c378591e113d915c3a1b1cd3c496b8");
		sums.put("mambawebsrvr.exe","c9a419231080df21daac2e6ce0bf687d");
		sums.put("mambaxlmsrvr.exe","e857eeebe866b43fe4affbd93cc8b861");
		sums.put("McApi.dll.new","81d6f23d30ffbf133b7f2cdde5e331f7");
		sums.put("nk.bin","495aad9a06f448abdb6ba25c806c4d2d");

	}

	@Override
	public String get(String fileName){
		return sums.get(fileName);
	}

}
