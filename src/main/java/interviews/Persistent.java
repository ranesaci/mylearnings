package interviews;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author sachin
* @date 02-Nov-2021
*/

public class Persistent {

	public static void main(String[] args) {
		int[] arr = {2,5, 1, 7,4};
		
		
		List<Integer> list = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		
		list.forEach(a -> System.out.println(a));

	}

}


