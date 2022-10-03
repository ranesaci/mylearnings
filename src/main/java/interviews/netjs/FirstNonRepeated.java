package interviews.netjs;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String str = "zanzibarnsi";
		
		str.chars().mapToObj(i -> (char) i)
		.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(es -> es.getValue()==1)
		.limit(1)
		.forEach(es -> System.out.println(es.getKey()));//b
	}

}
