package interviews.netjs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String str  = "123456789";
		
		System.out.println("reverse using for loop:" + reverseUsingForLoop(str));
		System.out.println("reverse using recusrsion:" + reverseUsingForRecursion(str));
		
		
		System.out.println("Reverse Words in a string");
		
		String data = "Sachin Nina Rane";
		String[] list = data.split("\\s+");
		for (int i = 0; i < list.length; i++) {
			list[i] = reverseUsingForRecursion(list[i]);
		}
		String result = Arrays.stream(list).collect(Collectors.joining(" "));
		System.out.println(result);//nihcaS aniN enaR
		

	}

	private static String reverseUsingForRecursion(String str) {
		if (str == null || str.length() == 0) {
			return str;
		}
		return reverseUsingForLoop(str.substring(1))+str.charAt(0);
	}

	private static String reverseUsingForLoop(String str) {
		StringBuilder sb = new  StringBuilder(str);
		for (int i = 0; i < sb.length()/2; i++) {
			char temp = sb.charAt(i);
			System.out.println("swapping"+ temp);
			sb.setCharAt(i, sb.charAt(sb.length()-1-i));
			sb.setCharAt(sb.length()-1-i, temp);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

}
