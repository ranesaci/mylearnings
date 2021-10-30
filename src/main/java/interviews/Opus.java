package interviews;

/**
 * @author sachin
 * @date 29-Oct-2021
 */

public class Opus {

	public static void main(String[] args) {
//		1
//		212
//		32123
//		4321234
//		543212345
//		4321234
//		32123
//		212
//		1

		int rowIndex = 5;
		int counter = 1;
		boolean flag = false;

		while (counter > 0) {

			for (int i = counter; i > 0; i--) {
				System.out.print(i + "");
			}

			for (int i = 2; i <= counter; i++) {
				System.out.print(i + "");
			}
			System.out.println();
			if (counter == rowIndex) {
				flag = true;
			}

			if (flag) {
				counter--;
			} else {
				counter++;
			}

		}

	}

}
