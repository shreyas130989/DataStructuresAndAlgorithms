package strings;

public class StringReverse {

	public static void main(String[] args) {
		StringReverse reverseString = new StringReverse();
		System.out.println(reverseString.reverseString("Sireeshaa"));
	}
	
	public String reverseString(String input) {
		StringBuilder stringBuilder = new StringBuilder();
		int stringLength = input.length();
	for(int i=stringLength -1 ; i>=0; i--) {
		stringBuilder.append(input.charAt(i));
	}
	return stringBuilder.toString();
	}
}
