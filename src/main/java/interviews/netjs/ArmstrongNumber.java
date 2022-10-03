package interviews.netjs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371;
		
		int temp = num;
		int sum = 0;
		int length = String.valueOf(num).length();
		while (temp > 0) {
			sum += Math.pow(temp%10, length);
			temp /=10;
		}
		if (num == sum) {
			System.out.println(num + " is armstrong");
		} else {
			System.out.println(num + " is not armstrong");
		}

	}

}
