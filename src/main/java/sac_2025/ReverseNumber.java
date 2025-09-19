package sac_2025;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = reverse(123);
		System.out.println("reverse num:"+ num);

	}

	private static int reverse(int num) {
		
		int sum = 0;
		
		
		while (num > 0) {
			int remainer = num%10;
			sum = (sum*10) + remainer;
			num /=10;
			
		}
		
		return sum;
	}

}
