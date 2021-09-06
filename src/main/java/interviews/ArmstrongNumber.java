package interviews;

/**
* @author sachin
* @date 05-Sep-2021
*/

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 153;
		boolean isArmstrong = isArmstrong(number);
		System.out.println(number + " is " + (isArmstrong ? "Armstrong" : "not Armstrong"));

	}

	private static boolean isArmstrong(int number) {
		
		int noOfDigits = String.valueOf(number).length();
		int givenNumber = number;
		int sum = 0;
		while (givenNumber != 0) {
			int lastDigit = givenNumber % 10;
			
			int powerOfSum = 1;
			for (int i = 0; i < noOfDigits; i++) {
				powerOfSum *= lastDigit;
			}
			
			sum = sum + powerOfSum;
			givenNumber /= 10;
		}
		
		if (number == sum) {
			return true;
		}
		return false;
	}

}


