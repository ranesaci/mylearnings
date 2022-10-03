package interviews.netjs;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1 = "peeker";
		String s2 = "keeper";
		
		boolean result = checkAnagram(s1, s2);
		System.out.println(s1 + " and "+ s2 + " are anagram:"+ result);

	}

	private static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		StringBuilder sb = new StringBuilder(s1);
		char[] strArr = s2.toCharArray();
		
		for (int i = 0; i < strArr.length; i++) {
			int index = sb.indexOf(strArr[i]+"");
			if (index == -1) {
				return false;
			} else {
				sb.deleteCharAt(index);
			}
		}
		
		return true;
	}

}
