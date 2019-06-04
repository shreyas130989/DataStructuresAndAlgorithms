package strings;

public class SubStringProgram {
   private static String mainString = "Shreyas";
   private static String subString = "hre";

   public static void main(String[] args) {
	   SubStringProgram subStringProgram = new SubStringProgram();
	   Integer result = subStringProgram.findSubString(mainString, subString);
	   if(result == null) {
		   System.out.println("SubString not found");
	   }
   }
   
   public Integer findSubString(String mainString, String subString) {
	Integer i,j;
    int m = mainString.length();
	int n = subString.length();
	for (i=0; i<(m-n); i++) {
		for(j=0; j<n && (mainString.charAt(i+j) == subString.charAt(j)) ; j++);
		if(j >=n) {
			System.out.println("match found at position =" + i.toString());
			return i;
		}
	}
	   return null;
   }
}
