package interviews.netjs;

import java.util.ArrayList;
import java.util.List;

public class Fibonnacci {

	public static void main(String[] args) {
		List<Integer> fibonnaci = new ArrayList<Integer>();
		fibonnaci.add(0);
		fibonnaci.add(1);
		fibonnaci(fibonnaci.get(0), fibonnaci.get(1), fibonnaci, 10);
		fibonnaci.forEach(a -> System.out.print(a+ " "));//0 1 1 2 3 5 8 13 21 34 
		

	}

	private static void fibonnaci(Integer first, Integer second, List<Integer> fibonnaci, int i) {
		if (fibonnaci.size() == i) {
			return;
		}
		
		int third = first+ second;
		fibonnaci.add(third);
		fibonnaci(second, third, fibonnaci, i);
	}

}
