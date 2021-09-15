package interviews;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
* @author sachin
* @date 18-Aug-2021
*/

public class Test {

	public static void main(String[] args) throws IOException {
		
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
		
		System.out.println("list through all files in folder");
		
		Files.list(Paths.get("./")).forEach(System.out::println);
		
		System.out.println("walk through all files in folder");
		
		Files.walk(Paths.get("./")).forEach(System.out::println);
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		
	
	}

}

class A {
	//dummy class

}


