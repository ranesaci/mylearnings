package general;

import java.math.BigInteger;

public class ConstantInterfaceAntipattern implements Interface11{

	public static void main(String[] args) {
		System.out.println(name);
		
		String str = null;
		System.out.println(new BigInteger(str));
	}

}

interface Interface11 {
	String name = "Sachin";
}
