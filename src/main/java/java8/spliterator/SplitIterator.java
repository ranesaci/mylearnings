package java8.spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
* @author sachin
* @date 24-Aug-2021
*/

public class SplitIterator {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Sachin");
		list.add("Nina");
		list.add("Rane");
		list.add("Pune");
		list.add("Maharashtra");
		
		Spliterator<String> splitIterator = list.stream().spliterator();
		splitIterator.forEachRemaining(a -> System.out.println(a));
		
		//try split
		
		Spliterator<String> trySplit1 = list.stream().spliterator();
		Spliterator<String> trySplit2 = trySplit1.trySplit();
		
		System.out.println("trySplit1 size:" + trySplit1.estimateSize());
		System.out.println("trySplit2 size:" + trySplit2.estimateSize());
		
		System.out.println("Iterating trySplit1");
		trySplit1.forEachRemaining(a -> System.out.println(a));
		
		
		System.out.println("Iterating trySplit2");
		trySplit2.forEachRemaining(a -> System.out.println(a));
		
		//tryAdvance
		
		System.out.println("******tryAdvance**********");
		Spliterator<String> tryAdvanceSplit = list.spliterator();
		int count = 0;
		while (tryAdvanceSplit.tryAdvance(System.out::println)) {
			
			System.out.println("count:" + count);
			count++;
			System.out.println("ExactSizeIfKnown:" + tryAdvanceSplit.getExactSizeIfKnown());
		}
		
		//characteristics
		
		System.out.println("tryAdvanceSplit.DISTINCT:" + tryAdvanceSplit.DISTINCT);
		System.out.println("tryAdvanceSplit.CONCURRENT:" + tryAdvanceSplit.CONCURRENT);
		System.out.println("tryAdvanceSplit.IMMUTABLE:" + tryAdvanceSplit.IMMUTABLE);
		System.out.println("tryAdvanceSplit.NONNULL:" + tryAdvanceSplit.NONNULL);
		System.out.println("tryAdvanceSplit.ORDERED:" + tryAdvanceSplit.ORDERED);
		System.out.println("tryAdvanceSplit.ORDERED:" + tryAdvanceSplit.SORTED);
		System.out.println("tryAdvanceSplit.SIZED:" + tryAdvanceSplit.SIZED);
		System.out.println("tryAdvanceSplit.SUBSIZED:" + tryAdvanceSplit.SUBSIZED);
		
		List<Integer> characteristics = new ArrayList<Integer>();
		characteristics.add(tryAdvanceSplit.CONCURRENT);
		characteristics.add(tryAdvanceSplit.DISTINCT);
		characteristics.add(tryAdvanceSplit.IMMUTABLE);
		characteristics.add(tryAdvanceSplit.NONNULL);
		characteristics.add(tryAdvanceSplit.ORDERED);
		characteristics.add(tryAdvanceSplit.SORTED);
		characteristics.add(tryAdvanceSplit.SIZED);
		characteristics.add(tryAdvanceSplit.SUBSIZED);
		
		Spliterator<Integer> characteristicsSplietrator =  characteristics.stream().spliterator();
		
		while (characteristicsSplietrator.tryAdvance(a -> {
			if (characteristicsSplietrator.hasCharacteristics(a)) {
				System.out.println(a + " characteristic avaiable");
			} else {
				System.out.println(a + " characteristic NOT avaiable");
			}
		})) {
		}
		
		
	}

}


