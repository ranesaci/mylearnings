package interviews;

import java.util.Iterator;

/**
* @author sachin
* @date 04-Sep-2021
*/

class PrintPyramidTest {
	
	public static void main(String[] args) {
		
		int pyramidRows = 8;
		int rowCount = 8;
		
		System.out.println("dd");
		
		for (int i = pyramidRows; i > 0; i--) {
			//fill spaces
			for (int j = 1; j < i*2; j++) {
				System.out.print(" ");
			}
			
			//print data
			for (int j = rowCount; j <= pyramidRows; j++) {
				System.out.print(j + " ");
			}
			//print data
			for (int j = pyramidRows-1; j >= rowCount; j--) {
				System.out.print(j + " ");
			}
			rowCount--;
			System.out.println();
		}
	}
}

/*
			   8 
             7 8 7 
           6 7 8 7 6 
         5 6 7 8 7 6 5 
       4 5 6 7 8 7 6 5 4 
     3 4 5 6 7 8 7 6 5 4 3 
   2 3 4 5 6 7 8 7 6 5 4 3 2 
 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
*/


