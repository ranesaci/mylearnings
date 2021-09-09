package interviews;

import java.util.ArrayList;
import java.util.List;

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
		
		////////////
		
		System.out.println("Space replace: "+ "Sa   chi n    Ra ne".replaceAll("\\s", ""));
		
		List<String> list = new ArrayList<String>();
		list.add("Sachin");
		list.add("Nina");
		list.add("Rane");
		
		List<String> sublist = list.subList(0, 2);
		System.out.println("list :" + list);
		System.out.println("sublist: " + sublist);
		
		//adding element to sublist
		System.out.println("after adding element to sublist:");
		sublist.add("Pune");
		
		System.out.println("list :" + list);
		System.out.println("sublist: " + sublist);
		
	
	}

}

class A {
	//dummy class

}


