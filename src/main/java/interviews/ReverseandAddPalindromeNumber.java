package interviews;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
* @author sachin
* @date 06-Sep-2021
*/

public class ReverseandAddPalindromeNumber {
	
	@Test
	public void testReverseandAddPalindromeNumber() {
		assertEquals(497794, reverseAndAddPalindrome(7325));
	}
	
	@Test
	public void testReverseNumber() {
		assertEquals(1234, getReverseNumber(4321));
	}

	private Integer reverseAndAddPalindrome(int number) {
		
		int reverseNumber = getReverseNumber(number);
		int result = number+reverseNumber;
		System.out.println(number + " => " 
		+ number + " + " + reverseNumber + "=" + result);
		
		if(isPalindrome(result)) {
			return result;
		} else {
			return reverseAndAddPalindrome(result);
		}
		
	}

	private boolean isPalindrome(int result) {
		
		if (result == getReverseNumber(result)) {
			return true;
		}
		return false;
	}

	private static int getReverseNumber(int number) {
		int temp = number;
		int result = 0;
		while(number > 0) {
			int lastDigit = number % 10;
			result = result *10 + lastDigit;
			number /= 10;
		}
		
		System.out.println("Reverse of "+ temp + " is "+result);
		return result;
	}

}


