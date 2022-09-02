package general;

import java.math.BigDecimal;

public class GenericsAtMethod {
	
	public static <T>  void getData(T val) {
		System.out.println(val);
	}
	
	public static <T> T  getData1(T val) {
		return val;
	}
	
	public static void main(String ...strings ) {
		getData(new BigDecimal(15));
		
		System.out.println("getData:" + getData1(new Integer(10)));
	}

}
