package interviews;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* @author sachin
* @date 23-Oct-2021
*/

public class GroupByAndCountInJava8 {

	public static void main(String[] args) {
		String str = "Sachin Nina Rane Sachin Nina Rane Pune";
		
		Integer[]  arr = {1,2, 3,4,5,6};
		//convert to list
		List<Integer> list = Arrays.asList(arr);
		System.out.println(Arrays.toString(arr));
		list.forEach(System.out::println);
		
	  	Map<String, Long> map =  Stream.of(str.split(" ")).
	  			collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	  	map.forEach((k,v) -> System.out.println(k + " : " +v));
	  	
	  	//
	  	Map<String, Long> map1 =   str.chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
	  	map1.forEach((k,v) -> System.out.println(k + " : " +v));
	  	
	  	System.out.println("sorting in desc by value using compare function");
	  	Map<String, Integer> mapData = new HashMap<String, Integer>();
	  	mapData.put("Sachin", 10);
	  	mapData.put("nina", 19);
	  	mapData.put("rane", 5);
	  	mapData.put("pune", 15);
	  	mapData.put("pune1", 25);
	  	mapData.put("pun2", 7);
	  	mapData.put("pune3", 40);
	  	
	  	Map<String, Integer> sortedMapData = mapData.entrySet()
	  			.stream().sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue())
	  			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)-> b, LinkedHashMap::new));
	  	sortedMapData.forEach((k,v) -> System.out.println(k + " : " +v));
	  	
	  	//lowest value key
	  	String s = mapData.entrySet().stream().
	  			sorted(Map.Entry.comparingByValue()).limit(1).map(a -> a.getKey()).collect(Collectors.joining());
	  	
	  	System.out.println("sorting map by values and lowest value key:" + s);
	  //highest second max
	  	String s1 = mapData.entrySet().stream().max((a, b) -> a.getValue() > b.getValue() ? 1:-1)
	  			.map(a -> a.getKey()).get();
	  	
	  	System.out.println("sorting map by values and highest value key:" + s1);
	  	
	  	//find  third low
	  	String thirdLowest = mapData.entrySet().stream().
	  			sorted(Map.Entry.comparingByValue()).skip(2).findFirst().get().getKey();
	  	System.out.println("sorting map by values and 3rd lowest value key:" + thirdLowest);
	  	
	  //find  third highest
	  	String thirdHighest = mapData.entrySet().stream().
	  			sorted((a,b) -> b.getValue() - a.getValue()).skip(2).findFirst().get().getKey();
	  	System.out.println("sorting map by values and 3rd highest value key:" + thirdHighest);
	}

}


