package interviews.netjs;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str  = "bananas";
		
		//here we need to check for even and odd length palindromes with highest length
		
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			String palindromeStr = getPalindromes(str, i,i);//for odd length palindrome
			System.out.println("odd palindrome:"+ palindromeStr);
			if (result.length() < palindromeStr.length()) {
				result = palindromeStr;
			}
			palindromeStr = getPalindromes(str, i,i+1);//for even length palindrome
			System.out.println("even palindrome:"+ palindromeStr);
			if (result.length() < palindromeStr.length()) {
				result = palindromeStr;
			}
		}
		System.out.println("max PALINDROME in "+ str + " is:" + result);

	}

	private static String getPalindromes(String str, int start, int end) {
		while (start >= 0 && end <= str.length()-1 && str.charAt(start) == str.charAt(end)) {
			start--;
			end++;
			
		}
		
		return str.substring(start+1, end);
	}

}
