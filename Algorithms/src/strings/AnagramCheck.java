package strings;

import java.util.Arrays; /** * Java program - String Anagram Example. * This program checks if two Strings are anagrams or not * * @author Javin Paul */
public class AnagramCheck { /* * One way to find if two Strings are anagram in Java. This method * assumes both arguments are not null and in lowercase. * * @return true, if both String are anagram */
    public boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c: chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    } 
    public static void main(String[] args) {
    	AnagramCheck anagramCheck = new AnagramCheck();
    	if(anagramCheck.isAnagram("sireeshaa", "reeaahssi")) {
    		System.out.println("strings are anagrams");
    	} else {
    		System.out.println("strings are not anagrams");
    	}
    }
}