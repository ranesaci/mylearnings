package interviews.netjs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {
		
		long count = Stream.of(31).filter(n -> { for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
		}).count();
		
		if (count == 1) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		
		
		//prime number generator
		int primeNums = 10;
		int num = 0;
		int sequence = 2;
		while (primeNums > 0) {
			boolean  flag = true;
			for (int i = 2; i < sequence/2; i++) {
				if (sequence % i == 0) {
					flag = false;
					break;
				}
			}
			
			
			if (flag) {
				System.out.print(sequence + " " );
				primeNums--;
			}
			sequence++;
		}
	}
	
	

}
