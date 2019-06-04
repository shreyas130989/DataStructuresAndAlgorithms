package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*Problem statement
Given a string, convert the string to palindrome without any modifications like adding a character, removing a character, replacing a character etc.*/
//https://www.geeksforgeeks.org/rearrange-characters-form-palindrome-possible/
public class RearrangeCharactersToFormPalindrome {

	public static void main(String[] args) {
		String input = "mdaam";
		RearrangeCharactersToFormPalindrome palindromeCheck = new RearrangeCharactersToFormPalindrome();
		System.out.println(palindromeCheck.getPalindrome(input));
		
	}
	
	public String getPalindrome(String str) {
		 
		  // Store counts of characters
		  Map<Character, Integer> hmap = new HashMap<>();
		  for (int i = 0; i < str.length(); i++) {
			  Integer value = 0;
			  if(hmap.get(str.charAt(i)) != null) {
				  value = (Integer) hmap.get(str.charAt(i));
			  }
			  hmap.put(str.charAt(i), value +1);
		  }
		 
		  /* find the number of odd elements.
		     Takes O(n) */
		  int oddCount = 0;
		  Character oddChar = null;
		  @SuppressWarnings("rawtypes")
		Iterator iterator = hmap.entrySet().iterator();
		  while (iterator.hasNext()) {
			  @SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry)iterator.next();
		        
		        Integer valure = (Integer)pair.getValue();
		    if ((valure % 2) != 0) {
		      oddCount++;
		      oddChar = (Character)pair.getKey();
		    }
		  }
		 
		  /* odd_cnt = 1 only if the length of 
		     str is odd */
		  if (oddCount > 1 || oddCount == 1 && 
		                  str.length() % 2 == 0)
		    return "NO PALINDROME";
		 
		  /* Generate first halh of palindrome */
		  String firstHalf = "", secondHalf = "";
		  iterator = hmap.entrySet().iterator();
		  while(iterator.hasNext()){
			Map.Entry pair = (Map.Entry)iterator.next();
		    // Build a string of floor(count/2)
		    // occurrences of current character
			char[] chars = new char[(Integer)pair.getValue()/2];
			Arrays.fill(chars, (Character)pair.getKey());
			String s = new String(chars);
		 
		    // Attach the built string to end of
		    // and begin of second half
		    firstHalf = firstHalf + s;
		    secondHalf = s + secondHalf;
		  }
		 
		  // Insert odd character if there 
		  // is any
		  return (oddCount == 1) ? 
		         (firstHalf + oddChar.toString() + secondHalf) :
		         (firstHalf + secondHalf);
		}
}
