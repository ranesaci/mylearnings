package sac_2025;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8 {

	public static void main(String[] args) {
		
		
		String str = "Sachin Rane";
		//find first repeated char in string
		str.chars().mapToObj(ch -> (char) ch)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(es -> es.getValue() > 1)
		.findFirst().ifPresent(c -> System.out.println("first repeated: "+c.getKey()));
		
		// first non repeated
		
		str.chars().boxed().map(ch -> (char) ch.intValue())
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(es -> es.getValue() == 1)
		.findFirst().ifPresent(e -> System.out.println("first non repeated:"+ e.getKey()));
		
		//using char array using Instream range
		IntStream.range(0, str.length()).mapToObj(ch -> str.charAt(ch))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(es -> es.getValue() > 1)
		.findFirst().ifPresent(c -> System.out.println("first repeated using Instream range: "+c.getKey()));
		
		
		
		

	}

}
