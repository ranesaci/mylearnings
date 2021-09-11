package interviews;

import org.junit.Test;

/**
* @author sachin
* @date 10-Sep-2021
*/

public class SwapStringVariableWithoutTemp {
	
	@Test
	public void testSwap() {
		String s1 = "Sachin";
		String s2 = "Rane";
		
		System.out.println("Before:");
		System.out.println("s1:"+s1);
		System.out.println("s12:"+s2);
		
		s1 = s1+s2;
		s2 = s1.replace(s2, "");
		s1 = s1.replace(s2, "");
		
		System.out.println("Afetr:");
		System.out.println("s1:"+s1);
		System.out.println("s12:"+s2);
		
		System.out.println("swap numbers:");
		
		int ss1 = 11;
		int ss2 = 15;
		
		System.out.println("Before:");
		System.out.println("ss1:"+ss1);
		System.out.println("ss12:"+ss2);
		
		ss1 = ss1+ss2;
		ss2 = ss1-ss2;
		ss1 = ss1-ss2;;
		
		System.out.println("Afetr:");
		System.out.println("s1:"+ss1);
		System.out.println("s12:"+ss2);
	}

}


