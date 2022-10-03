package interviews.netjs;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

	public static void main(String[] args) {
		
		String str = "ABCD";
		List<String> list = new ArrayList<String>();
		
		findStringPermutations(str, "", list);
		list.forEach(System.out::println);
		System.out.println(list.stream().count());

	}

	private static void findStringPermutations(String str, String prefix, List<String> list) {
		if (str.length() == 0) {
			list.add(prefix);
		}
		for (int i = 0; i < str.length(); i++) {
			findStringPermutations(str.substring(0,i)+str.substring(i+1), prefix+str.charAt(i), list);
		}
		
	}

}
