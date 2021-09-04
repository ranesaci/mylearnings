package interviews;

/**
* @author sachin
* @date 18-Aug-2021
*/

public class Test {

	public static void main(String[] args) {
		
		//test for null instanceOf
		
		A a = new A();
		
		System.out.println("when a is non null : " + (a instanceof A));
		
		a = null;
		
		System.out.println("when a is null : " + (a instanceof A));
	
	}

}

class A {
	//dummy class

}


