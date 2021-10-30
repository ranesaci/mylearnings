package interviews;

/**
* @author sachin
* @date 28-Oct-2021
*/

public class FNB {

	public static void main(String[] args) {
		
		String str = "A nut for a jar of tuna";
		str = str.replaceAll("\\s+", "");
		System.out.println("Replaced str:" + str);
		
		boolean  result = checkPalinDrome(str);
		System.out.println(str + " " + (result ? " is palindrome" 
				: "Not plaindrome"));
	}

	private static boolean checkPalinDrome(String str) {
		
		for (int i = 0; i < str.length()/2; i++) {
			
			if (String.valueOf(str.charAt(i)).toUpperCase().
					equals(String.valueOf(str.charAt(str.length()-1-i)).toUpperCase()) 
					) {
				continue;
			}else { return false; }
				 
		}
		return true;
	}

}


