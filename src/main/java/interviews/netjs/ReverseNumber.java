package interviews.netjs;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1234;
		
		int result = 0;
		while(number > 0) {
			result = 10 * result + number%10;
			number /= 10;
		}
		System.out.println(result);

	}

}
