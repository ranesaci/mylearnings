package interviews;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
* @author sachin
* @date 05-Sep-2021
*/

//using recursion

public class SumOfAllDigits {

	@Test
	public void testSumOfAllDigits() {
		int result = calculateSumOfDigits(1234, 0);
		System.out.println(result);
		//assertEquals(10, calculateSumOfDigits(1234, 0));
	}

	private int calculateSumOfDigits(int number, int sum) {
		if (number == 0) {
			return sum;
		}
		
		return number%10 + calculateSumOfDigits(number/10, sum);
	}
}
