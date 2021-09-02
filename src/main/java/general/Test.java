package general;

import java.math.BigInteger;
import java.util.Scanner;

/**
sachin
17-Aug-2021
*/

public class Test {

	public static void main(String[] args) {
		/*
		 * System.out.println("hello!!!"); double d1 = 374.56; double d2 = 374.26;
		 * System.out.println( "d1 - d2 = " + ( d1 - d2 ));
		 */
		
		System.out.println("****************************");
		
		 System.out.println("Enter number of elements");
	        Scanner s = new Scanner(System.in);
	        //get data separated by line\
	        
	        String name = s.nextLine();                 // Reading input from STDIN
	        int n = Integer.parseInt(name);
	        
	        
	        System.out.println("enter values separated by space");
	        //s = new Scanner(System.in);
	        String[] splittedArray = s.nextLine().split(" ");
	        System.out.println("eneterd data of elements:: "+splittedArray);
	        
	        BigInteger result = new BigInteger("0");

	       for (int i=0; i < n; i++) {
	    	   result = result.add(new BigInteger(splittedArray[i]));

	       }
	       System.out.println(result);
	       System.out.println("finished!!!");

	}

}


