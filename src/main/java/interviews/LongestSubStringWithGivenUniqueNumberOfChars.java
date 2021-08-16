package interviews;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sachin
 *
 */
public class LongestSubStringWithGivenUniqueNumberOfChars {

	public static void main(String[] args) {
		String longestSubstring = getLongestSubString("sachinninarane", 2);
		System.out.println(longestSubstring);

	}

	private static String getLongestSubString(String str, int number) {
		
		Set<Character> uniqueCharsSet = new HashSet<Character>(); 
		int[] chars = new int[128];
		int index = 0, start = 0, end = 0;
		for (int i = 0; i < str.length(); i++) {
			
			uniqueCharsSet.add(str.charAt(i));
			chars[str.charAt(i)]++;
			
			while (number < uniqueCharsSet.size()) {
				if (--chars[str.charAt(index)] == 0) {
					
					uniqueCharsSet.remove(str.charAt(index));
				}
				index++;
			}
			
			if ((end-start) < (i-index)) {
				start = index;
				end = i;
			}
		}
		return str.substring(start, end+1);
	}

}
