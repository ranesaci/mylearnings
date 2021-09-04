package interviews;

/**
* @author sachin
* @date 04-Sep-2021
*/

public class PrintPyramid {

	public static void main(String[] args) {
		
	int pymamidRows = 8;
	int rowCount = 1;
	for (int i = pymamidRows; i > 0; i--) {
		
		//print spaces
		
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		
		//print numbers in each row
		for (int k = 0; k < rowCount; k++) {
			System.out.print(rowCount + " ");
		}
		
		System.out.println();
		rowCount++;
		
	}
	}
}
//prints

/*
       1 
      2 2 
     3 3 3 
    4 4 4 4 
   5 5 5 5 5 
  6 6 6 6 6 6 
 7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 
 */


class PrintPyramid1 {

	public static void main(String[] args) {
		
	int pymamidRows = 8;
	int rowCount = 1;
	for (int i = pymamidRows; i > 0; i--) {
		
		//print spaces
		
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		
		//print numbers in each row
		int internalCounter = 1;
		for (int k = 0; k < rowCount; k++) {
			System.out.print(internalCounter++ + " ");
		}
		
		System.out.println();
		rowCount++;
		
	}
	}
}

/*
       1 
      1 2 
     1 2 3 
    1 2 3 4 
   1 2 3 4 5 
  1 2 3 4 5 6 
 1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
*/

class PrintPyramidStars {

	public static void main(String[] args) {
		
	int pymamidRows = 8;
	int rowCount = 1;
	for (int i = pymamidRows; i > 0; i--) {
		
		//print spaces
		
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		
		//print numbers in each row
		for (int k = 0; k < rowCount; k++) {
			System.out.print("*" + " ");
		}
		
		System.out.println();
		rowCount++;
		
	}
	}
}

/*
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 

*/

class PrintPyramid2 {

	public static void main(String[] args) {
		
	int pymamidRows = 8;
	int rowCount = 1;
	for (int i = pymamidRows; i > 0; i--) {
		
		//print spaces
		
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		
		//print numbers in each row
		for (int k = 1; k <= rowCount; k++) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		rowCount++;
		
	}
	}
}

/*
       1 
      1 2 
     1 2 3 
    1 2 3 4 
   1 2 3 4 5 
  1 2 3 4 5 6 
 1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 

*/

class PrintPyramid3 {

	public static void main(String[] args) {
		
	int pymamidRows = 8;
	int rowCount = 1;
	for (int i = pymamidRows; i > 0; i--) {
		
		//print spaces
		
		for (int j = 1; j < i*2; j++) {
			System.out.print(" ");
		}
		
		//print numbers in each row
		for (int k = 1; k <= rowCount; k++) { 
			System.out.print(k + " ");
		}
		for (int k = rowCount-1; k > 0 ; k--) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		rowCount++;
		
	}
	}
}

/*
               1 
             1 2 1 
           1 2 3 2 1 
         1 2 3 4 3 2 1 
       1 2 3 4 5 4 3 2 1 
     1 2 3 4 5 6 5 4 3 2 1 
   1 2 3 4 5 6 7 6 5 4 3 2 1 
 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
*/

class PrintPyramid4 {
	public static void main(String[] args) {
		
		int pyramidRows = 8;
		int rowcount = 8;
		//print spaces
		for (int i = pyramidRows; i > 0; i--) {
			
			//print spaces
			for (int j = i*2; j < pyramidRows*2; j++) {
				System.out.print(" ");
			}
			
			//print data
			for (int k = 1; k <= rowcount; k++) {
				System.out.print(k + " ");
			}
			//print data
			for (int k = rowcount-1; k >0; k--) {
				System.out.print(k + " ");
			}
			
			System.out.println();
			rowcount--;
		}
		
	}
}

/*
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 6 5 4 3 2 1 
    1 2 3 4 5 6 5 4 3 2 1 
      1 2 3 4 5 4 3 2 1 
        1 2 3 4 3 2 1 
          1 2 3 2 1 
            1 2 1 
              1 

*/


