package interviews.netjs;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		
		boolean result = checkPalindrome(str);
		System.out.println(str + " is palindrome: "+ result);
		result = checkPalindromeUsingForLoop(str);
		System.out.println(str + " is palindrome using for loop: "+ result);
	}

	private static boolean checkPalindromeUsingForLoop(String str) {
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		
		return flag;
	}

	private static boolean checkPalindrome(String str) {
		int low = 0;
		int high = str.length()-1;
		boolean result = true;
		
		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		
		return result;
	}

}
