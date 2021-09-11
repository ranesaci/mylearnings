package interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
* @author sachin
* @date 10-Sep-2021
*/

public class MapInDescendingBasedOnValue {
	@Test 
	public void testMapInDescendingOrderBasedOnValue() {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sachin", 2);
		map.put("Nina", 4);
		map.put("Rane", 2);
		map.put("Pune", 7);
		
		System.out.println("Given Map:" + map);
		List<Entry<String, Integer>> list = new  ArrayList<Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		});
		
		
		System.out.println("After sorting in descending based on values");
		System.out.println("sorted Map:" );
		list.forEach(System.out::println);
		
		//floyd's triangle
		System.out.println("floyd's triangle");
		
		int count=1;
		int k = 1;
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 0; j < count; j++) {
				System.out.print(k++ + " ");
				
			}
			System.out.println();
			count++;
		}
		
	}

}


