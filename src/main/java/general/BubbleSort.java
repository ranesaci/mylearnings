package general;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
* @author sachin
* @date 19-Oct-2021
*/

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 1, 1, 2, 0, 1};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr [j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}


