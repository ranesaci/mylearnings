package general;

/**
* @author sachin
* @date 09-Oct-2021
*/

public class AutoBoxing {

	public static void main(String[] args) {
		
		foo(new Integer(0), true);
		
		System.out.println("SachinNinaRane".substring(-3));

	}

	private static void foo(Object i, Object b) {
		System.out.println("in Object type");
		
	}
	
	private static void foo(Object i, boolean b) {
		System.out.println("in Object boolean type");
			
		}


}


