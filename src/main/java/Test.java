import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Sachin", null, "rane", null);
		List<String> nonNullListWitFilter =  nameList.stream().filter(e -> (e != null)).collect(Collectors.toList());
		System.out.println("nonNullListWitFilter");
		nonNullListWitFilter.forEach(System.out::println);
		
		// with Stream.ofNullable
		
		List<String> listWithOfNullable =  nameList.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
		System.out.println("listWithOfNullable");
		listWithOfNullable.forEach(System.out::println);
		
		System.out.println("Stream iterate");
		Stream.iterate(0, e -> e+2).limit(15).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("**********************************8");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.size());
		
		list = list.stream().limit(list.size()-2).collect(Collectors.toList());
		System.out.println(list);
		
		Map<String , Integer> map = new HashMap<>();
		
		map.put("sachin", 1);
		System.out.println(map.get("sachin") == 1);

	}

}
