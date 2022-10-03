package interviews.netjs;

public class StringSubSequence {

	public static void main(String[] args) {
		String s1 = "sac";
		String s2 = "admshavc";
		boolean flag = false;
		
		int i = 0;
		for (int j = 0; j < s2.length(); j++) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
			}
			if (i == s1.length()) {
				flag = true;
				
			}
		}
		
		if(flag) {
			System.out.println("String is subsequence");
		} else {
			System.out.println("String is NOT subsequence");
		}
		
	}

}
