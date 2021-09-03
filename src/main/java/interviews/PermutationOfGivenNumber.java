package interviews;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* @author sachin
* @date 02-Sep-2021
*/

public class PermutationOfGivenNumber {

	public static void main(String[] args) {
		Set<Integer> result = findPermutations(1234);
		result.forEach(System.out::println);

	}

	private static Set<Integer> findPermutations(int number) {
		Set<String> set = new HashSet<String>();
		permutations("", String.valueOf(number), set);
		return set.stream().map(a -> Integer.parseInt(a)).collect(Collectors.toSet());
	}

	private static void permutations(String prefix, String number, Set<String> set) {
		
		if (number.length() == 0) {
			set.add(prefix);
			return;
		}
		
		for (int i = 0; i < number.length(); i++) {
			
			permutations(prefix+number.charAt(i), number.substring(0,i) + 
					number.substring(i+1, number.length()), set);
		}
	}
	

}


