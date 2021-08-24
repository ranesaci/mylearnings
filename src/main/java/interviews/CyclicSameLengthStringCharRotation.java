package interviews;

/**
* @author sachin
* @date 24-Aug-2021
*/

public class CyclicSameLengthStringCharRotation {
	static int n=1000;
	static int counter;
	public static void main(String[] args) throws InterruptedException {
		rotate("Sachin Nina Rane ");

	}

	private static void rotate(String string) throws InterruptedException {
		
		while (counter < n) {
			//System.out.println(string);
			print(string);//print chars one by one with delay
			counter++;
			//Thread.sleep(100);
			rotate(string.substring(1) + string.substring(0,1));
		}
		
	}

	private static void print(String string) throws InterruptedException {
		
		for (char charElement : string.toCharArray()) {
			Thread.sleep(10);
			System.out.print(charElement + " ");
		}
		System.out.println();
	}

}


