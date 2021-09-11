package interviews;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

/**
* @author sachin
* @date 09-Sep-2021
*/

public class BreakInElse {
	
	@Test
	public void testLongestString() {
		String string="GEEKSFORGEEKS";
		getLongestSubstring(string);
	}
	
	@Test
	public void testLongestSubstring() {
		System.out.println(getLongestStringWithUniqueChars("GEEKSFORGEEKS"));
	}
	
	@Test
	public void testBreakInElse() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("i:" + i);
			if (i != 5) {
				
			} else {
				break;
			}
		}
	}
	
	private static void getLongestSubstring(String string) {
		// ArrayList al1=new ArrayList();
		ArrayList<String> al2 = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			ArrayList al1 = new ArrayList();
			// oStringBuffer sb=new StringBuffer();
			Character c = string.charAt(i);
			al1.add(c);
			String s = c.toString();
			for (int j = i + 1; j < string.length(); j++) {
				if (!al1.contains(string.charAt(j))) {

					al1.add(string.charAt(j));
					s = s + string.charAt(j);
					al2.add(s);
				} else {

					break;
				}

			}

		}
		ArrayList<String> al3 = new ArrayList<>();
		int length = 0;
		for (String string2 : al2) {
			System.out.println(string2);
			if (string2.length() > length) {
				al3.clear();
				al3.add(string2);
				length = string2.length();
			} else if (string2.length() == length) {
				al3.add(string2);
			}
		}
		for (String string2 : al3) {
			System.out.println("Longest substring is " + string2 + " with length " + string2.length());
		}
	}
	
	public String getLongestStringWithUniqueChars(String str) {
		
		char[] chars = str.toCharArray();
		int length = 0;
		String result = "";
		
		for (int i = 0; i < chars.length; i++) {
			
			Set<Character> charSet = new LinkedHashSet<Character>();
			charSet.add(str.charAt(i));
			
			for (int j = i+1; j < chars.length; j++) {
				
				if (charSet.add(str.charAt(j))) {
					if (str.substring(i, j+1).length() > length) {
						result = str.substring(i, j+1);
						length = str.substring(i, j+1).length();
					}
					
					
				} else {
					break;
				}
			}
			
		}
		
		return result;
	}

}


