package interviews.netjs;

public class Swap {
	
	public static void main(String[] aargs) {
		
		int a=10,b=30;
		
		System.out.println("a:"+a + " and b:"+b);
		
		a=a+b;//10+30=40
		b=a-b;
		a=a-b;
		System.out.println("after swap:");
		System.out.println("a:"+a + " and b:"+b);
		
		System.out.println("swap strings");
		
		String s1 = "Sachin", s2 = "Rane";
		System.out.println("s1:"+s1 + " and s2:"+s2);
		
		s1 = s1+s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("after swap:");
		System.out.println("s1:"+s1 + " and s2:"+s2);
		
	}

}
