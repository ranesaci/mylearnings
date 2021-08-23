package interviews;

import java.util.HashSet;
import java.util.Set;

/**
* @author sachin
* @date 24-Aug-2021
*/

//using recursion

public class StringPermutation {
	private static final Set<String> set = new HashSet<String>();

	public static void main(String[] args) {
		permutation("", "abcd");
		for (String string : set) {
			System.out.println(string);
			
		}

	}
	
	public static void permutation(String prefix, String str) {
		if (str.length() == 0) {
			set.add(prefix);
		}
		
		for (int i = 0; i < str.length(); i++) {
			permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1, str.length()));
		}
		
	}

}


