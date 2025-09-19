package sac_2025;

public class Damroo {

	public static void main(String[] args) {
		
		int height = 9;
		
		
		for (int i = height; i >= 1; i--) {
			int counter = i;
			for (int j = height-counter; j >= 1; j--) {
				System.out.print(" ");
				counter++;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
		

	}

}
