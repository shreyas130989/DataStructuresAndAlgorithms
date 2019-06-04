package strings;

public class StringCompress {

	private static String inputString = "sireeshaaa";
	
	public static void main(String[] args) {
		StringCompress stringCompress = new StringCompress();
		System.out.println(stringCompress.compressString(inputString));
	}

	public String compressString(String input) {
		StringBuilder outBuilder = new StringBuilder();
        char prevChar = input.charAt(0);
        int counter = 0;
        char currChar;
        int length = input.length();
        for(int i=0; i<length; i++){
            currChar = input.charAt(i);
            if(currChar == prevChar){
                counter++;
            } else {
                outBuilder.append(prevChar);
                outBuilder.append(counter);
                prevChar = currChar;
                counter=1;
            }
            // For the last unique characters when we reach the end of the string
            if(i == length-1){
                outBuilder.append(currChar);
                outBuilder.append(counter);
            }
        }
        return outBuilder.toString();
	}
	
}
