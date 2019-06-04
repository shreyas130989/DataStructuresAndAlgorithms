package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonStringCC {
	
	static Map<Character, Integer> hashMap = new HashMap<>();
	
	public static void CommonAlp(String s, String s1){
		
		for(int i=0;i<s.length();i++){
			hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
		}
		for(int i=0;i<s1.length();i++) {
			if(hashMap.get(s1.charAt(i)) != null) {
				//if the element is present in the hashMap so its common for both strings, so print it
				System.out.print(s1.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Strings : ");
		String c1 = in.next();
		in.nextLine();
		String c2 = in.nextLine();
		
		CommonAlp(c1,c2);
	}

}