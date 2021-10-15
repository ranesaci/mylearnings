package interviews;

import java.util.Arrays;

/**
* @author sachin
* @date 15-Oct-2021
*/

public class ArrayCopyRangeOf {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 4)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 5)));
		
		int[] copy = new int[5];
		System.arraycopy(arr, 2, copy, 0, 5);
		System.out.println(Arrays.toString(copy));
		

	}

}


