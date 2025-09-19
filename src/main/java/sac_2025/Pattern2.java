package sac_2025;

public class Pattern2 {

	public static void main(String[] args) {
		
		int height = 9;
		int counter = 0;
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(++counter + " ");
			}
		
			System.out.println();
			
		}
		

	}

}
