package strings;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.text.WordUtils;

public class SubString {

	public static void main(String[] args) {
		System.out.println(Boolean.TRUE.toString());
		// TODO Auto-generated method stub
		String hasNewline = "[Earns 3% Back\n" + 
				"\\u201c% Back rewards\\u201d (or just \\u201c% Back\\u201d) are the rewards you earn under the program. % Back rewards are tracked as points and each $1 in % Back rewards earned is equal to 100 points. The Rewards Program Agreement at https://chaseonline.chase.com/resources/RPA0441_0510_Web.pdf governs how you can earn and redeem your % Back rewards. See www.Chase.com/RewardsCategoryFAQs for more information.]";
        String noNewline = "[Earns 3% Back\\u201c% Back rewards\\u201d (or just \\u201c% Back\\u201d) are the rewards you earn under the program. % Back rewards are tracked as points and each $1 in % Back rewards earned is equal to 100 points. The Rewards Program Agreement at https://chaseonline.chase.com/resources/RPA0441_0510_Web.pdf governs how you can earn and redeem your % Back rewards. See www.Chase.com/RewardsCategoryFAQs for more information.]";

        System.out.println(WordUtils.capitalizeFully("CANCEL"));
        noNewline = noNewline.replace(System.getProperty("line.separator"), "");
        System.out.println(hasNewline.contains(System.getProperty("line.separator")));
        System.out.println(hasNewline.contains("\\n"));
        System.out.println(noNewline.contains("\n"));
        System.out.println(noNewline.contains("\\n"));
		String mainString = "Shreyas";
		String subString = "eyas";
		Sub(mainString,subString);
		String test = "3500,0,2,25,2000,2000,2000,9000,9000,9000,840000,900000,4800,1000,28000,25000,2100,200,200,9790";
		int length = test.split(",").length;
		System.out.println("Length of the String is = " + length);
		Map<String, String> testMap = new HashMap<>();
		testMap.put("testKey", "TestValue");
		System.out.println(testMap);
	}
	public enum VoltronStatus {
	    ENABLED_FOR_ANDROID,
	    ENABLED_FOR_IOS,
	    DISABLED
	}
	
	private static void Sub(String mainString,String subString) {
		// TODO Auto-generated method stub
		int i,j;
		int m = mainString.length();
		int n = subString.length();
		VoltronStatus voltronStatus = VoltronStatus.DISABLED;
		switch(voltronStatus) {
		case DISABLED: 
			System.out.println("inside disabled");
			break;
		default:
			System.out.println("inside default");
			break;
		}
		for(i=0;i<=(m-n);i++) {
			for(j=0;j<n&&(mainString.charAt(i+j)==subString.charAt(j));++j);
			if(j>=n) {
			 System.out.println("match found");
			}
		}

	}

	

}