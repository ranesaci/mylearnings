package interviews;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
* @author sachin
* @date 07-Sep-2021
*/

public class SelectionSort {
	
	@Test
	public void testSelectionSort() {
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, 
				selctionSort(new int[] {4,5,1,6,8,7,3,2}));
		
	}
	
	public static  int[] selctionSort(int[] array) {
		
		int pos=0;
		
		for (int i = 0; i < array.length; i++) {
			pos = i;
			
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[pos]) {
					pos = j;
					System.out.println("pos updated from "+ pos + " to "+ j);
				}
			}
			
			int temp = array[pos];
			array[pos] = array[i];
			array[i] = temp;
			
			System.out.println("for position = "+ pos + " , Array is: "+ Arrays.toString(array));
		}
		return array;
		
	}

}


