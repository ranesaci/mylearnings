package interviews;

import java.util.Arrays;
import java.util.Iterator;

public class LongestStringWithUniqueChars {

	public static void main(String[] args) {
		String input = "SachinNinaefghijklmnoRane";
		String longestString = getLongstString(input);
		System.out.println(longestString.length());
		System.out.println(longestString);
		int a = 'a';
		System.out.println(a);
		int A = 'A';
		System.out.println(A);
		char[] charArray = new char[256];
		for (int i = 0; i < 255; i++) {
			
			charArray[i] = (char) i;
		}

		System.out.println(charArray);
	}

	private static String getLongstString(String longest) {
		
		int length = longest.length();
		String resultString = "";
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (isStringWithUniqueChars(longest, i, j)) {
					if (resultString.length() < longest.subSequence(i, j).length()) {
						resultString = longest.substring(i,j);
					}
				}
			}
		}
		
		return resultString;
	}

	private static boolean isStringWithUniqueChars(String longest, int i, int j) {
		
		boolean[] boolArray = new boolean[256];
		Arrays.fill(boolArray, false);
		for (int k = i; k < j; k++) {
			if (boolArray[longest.charAt(k)] == true ) {
				return false;
			} else {
				boolArray[longest.charAt(k)] = true;
			}
		}
		
		return true;
	}

}
