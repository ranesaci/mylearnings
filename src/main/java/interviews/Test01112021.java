package interviews;

/**
* @author sachin
* @date 01-Nov-2021
*/

public class Test01112021 {

	public static void main(String[] args) {
		boolean b1 = false;
		boolean b2 = false;
		
		boolean a = b2 != b1;
		System.out.println(a);
		
		
//		if (b2 != b1 == !b2) {
//			System.out.println("true123");
//		} else {
//			System.out.println("false123");
//		}
		
		String str1 = "Sachin";
		String str2 = "Rane";
		
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length() - str2.length());// Sachin
		str1 = str1.substring(str2.length());
		
		System.out.println("str1:"+ str1);
		System.out.println("str2:"+ str2);
				
				
//		a=15;
//		b=20;
//		a = a+b = 35;
//		b = a-b = 35-20 = 15
//		a  = a - b = 35 -15 = 20
		
		System.out.println("first repeated");
		String str = "SachinNinaRane";
		char ch = 0;
		for (int i = 0; i < str.length(); i++) {
			String newStr = str.substring(0, i)+str.substring(i+1);
			if (newStr.contains(String.valueOf(str.charAt(i)))) {
				ch = str.charAt(i);
				break;
			}
			
		}
		System.out.println(ch);
		
		System.out.println("first non repeated");
		String str11 = "SachinNinaRaneS";
		char ch1 = 0;
		for (int i = 0; i < str11.length(); i++) {
			String newStr = str.substring(0, i)+str11.substring(i+1);
			if (!newStr.contains(String.valueOf(str11.charAt(i)))) {
				ch1 = str11.charAt(i);
				break;
			}
			
		}
		System.out.println(ch1);

	}

}


