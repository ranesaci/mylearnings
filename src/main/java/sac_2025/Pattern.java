package sac_2025;

public class Pattern {

	public static void main(String[] args) {
		
		int height = 9;
		for (int i = 1; i <= height; i++) {
			for (int j = height-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
			
		}
		

	}

}
