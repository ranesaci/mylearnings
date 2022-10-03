package interviews.netjs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrangeNonNegativeToLargest {

	public static void main(String[] args) {
		int[] arr = {2, 35, 23, 6, 8};
		///int[] arr = {7,70,8};
		Arrays.stream(arr).boxed().sorted((a,b) -> {
			String s1 = a.toString()+b.toString();
			String s2 = b.toString()+a.toString();
			return s2.compareTo(s1);
		}).collect(Collectors.toList()).forEach(a -> System.out.print(a+""));///8635232
	}

}
