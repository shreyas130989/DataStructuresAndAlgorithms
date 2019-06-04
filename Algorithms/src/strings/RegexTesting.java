package strings;

import java.nio.file.DirectoryStream.Filter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTesting {

	private static final Pattern regexPattern = Pattern.compile("^(vn_).*$");
	
	private static final String TEST_INPUT = "This is a test sentence";
	
	public static void main(String args[]) {
		String testString = "vn _ endactions";
		//System.out.println("SubString=" + testString.substring(5));
		Matcher matcher = regexPattern.matcher(testString);
		testString.startsWith("vnid");
		if (matcher.matches()) {
			System.out.println("The test string matched the regex");
			System.out.println("The value is " + matcher.group(0));
		} else {
			System.out.println("The test string does not match the regex");
		}
		
		int number_of_words = TEST_INPUT.split("/\n|\b|\t").length;
		System.out.print(number_of_words);
	}
}
