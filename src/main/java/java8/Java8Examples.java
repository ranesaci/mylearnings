package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Examples {

	public static void main(String[] args) {

		
		 int[] data = {11,22,13,53,16,7,89,9};
		 
//		 
//		/* List<Integer> list = IntStream.of(data).boxed().collect(Collectors.toList());
//		 * System.out.println(list);
//		 * 
//		 * String[] strData = new String[] {"sachin", "rane"}; List<String> listData =
//		 * Arrays.asList(strData); System.out.println(listData);
//		 */

		/*
		 * int[] arr = new Random().ints(5,0,11).toArray();
		 * System.out.println(Arrays.toString(arr));
		 */
		 
//		 List<Integer> list = IntStream.of(data).boxed().sorted().collect(Collectors.toList());

		 List<Integer> list = IntStream.of(data).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 
		 System.out.println(list.stream().max((a,b) -> a<b ? 1 : a>b ? -1 : 0).get());
		 System.out.println(list.stream().count());
		 
		 List<Employee> emps = IntStream.range(0, 1000).parallel().mapToObj(Employee::new).collect(Collectors.toList());
		 emps.forEach(a -> System.out.println(a.data() + " > " +a.hashCode()));
		 
		 List<Double> dList = Arrays.asList(new Double[] {9.0,16.0,25.0});
		 double d = dList.parallelStream().reduce(1.0, (a,b) -> a* Math.sqrt(b), (a,b) -> a*b).doubleValue();
		 System.out.println(d);
		 
		 double val = dList.parallelStream().peek(System.out::print).reduce(0.0, (a,b) -> {
			 System.out.println("a:"+a + " b:"+b);
			 return a+b;
		 }).doubleValue();
		 System.out.println(val);
		 
		 List<Double> doubleList = dList.stream().collect(() -> new ArrayList<>(), (alist, element) -> alist.add(element), (a,b) -> a.addAll(b) );
		 System.out.println(doubleList);
		 
		 int[] intData = {1,2,3,4,5,6,6,7,8,2,8,9,1};
		 //find first non - repeated number
		Map<Object, List<Object>>  map = IntStream.of(intData).boxed().collect(Collectors.groupingBy(a-> a, LinkedHashMap::new, Collectors.mapping(a->a, Collectors.toList())));
		map.entrySet().stream().filter(e -> e.getValue().size() == 1).limit(1).forEach(e -> System.out.println(e.getKey()));
		
		IntStream.of(intData).boxed().collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(es -> es.getValue() > 1).limit(1)
		.forEach((es)-> System.out.println(es.getKey() + " : "+ es.getValue()));
		
		String str1 = "Sachin Nina Rane"; //first repeated = a ..first non repeateed = S
		
		Stream<Character> chStream = str1.chars().mapToObj(i -> (char) i);
		chStream.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
		.filter(es -> es.getValue() == 1).limit(1).forEach(es -> System.out.println("first non repeated in "+ str1 + ":" +es.getKey()));
		
		str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet()
		.stream().filter(es -> es.getValue() > 1).limit(1).forEach(es -> System.out.println("first repeated in "+ str1 + ":" +es.getKey()));
		
		List<Order> orders = getOrders();
		long count = orders.stream().map(o -> o.getList().stream()).count();
		System.out.println(count);//3
		//flatmap
		
		count = orders.stream().flatMap(o -> o.getList().stream()).count();
		System.out.println(count);//6
		
		//generate 
		System.out.println("Generate#############");
		Stream.generate(Math::random).map(n -> (int) (n*10)).limit(5).forEach(System.out::println);
		
		System.out.println("Minimum>>>>>>");
		
		int min  = Arrays.stream(data).min().getAsInt();
		System.out.println(min);
		System.out.println("double min and max>>>>>>>>");
		double dval = dList.stream().min(Double::compare).get();
		System.out.println(dval);
		dval = dList.stream().max(Double::compare).get();
		System.out.println(dval);
		
		System.out.println("first and seconf max");
		Arrays.stream(data).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		
		System.out.println("sorting with intStream");
		Arrays.stream(data).boxed().sorted((a,b) -> a<b ? 1 : a>b ? -1 : 0).forEach(System.out::println);
		
	}

	private static List<Order> getOrders() {
		List<Order> list = new ArrayList<Order>();
		Order order1 = new Order(Arrays.asList(new String[] {"Sachin", "Rane"}));
		Order order2 = new Order(Arrays.asList(new String[] {"Sachin1", "Rane1"}));
		Order order3 = new Order(Arrays.asList(new String[] {"Sachin2", "Rane2"}));
		
		list.add(order1);
		list.add(order2);
		list.add(order3);
		return list;
	}

}

class Employee {
	private int i;
	public Employee(int data) {
		this.i = data;
	}
	public int data() {
		return i;
	}
}

class Order {
	List<String> list;
	
	public Order(List<String> list) {
		this.list = list;
	}
	
	public List<String> getList() {
		return list;
	}
}
