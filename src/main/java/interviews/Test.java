package interviews;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
* @author sachin
* @date 18-Aug-2021
*/

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		
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
		
		Runnable r = () -> System.out.println("Sachin Here");
		new Thread(r).start();
		
		//treeMap comparable use case
		
		/*
		 * TreeMap<B, A> map = new TreeMap<B, A>(); map.put(new B(), new A() );
		 * map.put(null, new A());
		 * 
		 * for (Object obj : map.entrySet()) { System.out.println(obj); }
		 */
		Thread.sleep(100);
		int[] count = new int[5];
		Arrays.fill(count, 0);
		System.out.println(Arrays.toString(count));
		count[1]++;
		System.out.println(Arrays.toString(count));
		count[1]++;
		System.out.println(Arrays.toString(count));
		
	
	}

}

class A {
	//dummy class

}

class B {
	int x;
	static int y;
	
	public void m1() {
		int a = 10;
		int b = 20;
		
		Runnable r =  new Runnable() {
			
			@Override
			public void run() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(a);
				System.out.println(b);
				
			}
		};
		new Thread(r).start();
	}
	
	public static void main(String[] args) throws Exception, FileNotFoundException, IOException {
		/*
		 * B b = new B(); b.m1();
		 */
		B bbb = new B();
		bbb.methodCalled(3);
	}
	
	public void methodCaller(int x) {
		System.out.println("Method Caller!!");
		B bb = new B();
			try {
				bb.methodCalled(x);
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void methodCalled(int x ) throws IOException, FileNotFoundException, Exception {
		System.out.println("Method Called!!");
		if (1 > x) {
			throw new FileNotFoundException();
		} else {
			throw new IOException();
		}
	}
	
	

}


