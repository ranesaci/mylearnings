package general;
import java.util.Arrays;

/**
* @author sachin
* @date 19-Oct-2021
*/

public class MaxSumWithMaxSubSequenceInArray {

	public static void main(String[] args) {
		int[] arr = { -2, 11, -4, 2, -3, -10 };
		//max sum with max subsequence
		int max_sum = 0;
		int[] max_subsequence = {};
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			
			for (int j = i+1; j < arr.length; j++) {
				x += arr[j];
				if (x >= max_sum) {
					max_sum = x;
					max_subsequence = Arrays.copyOfRange(arr, i, j+1);
				}
			}
			
		}
		
		System.out.println("max_sum:" + max_sum);
		System.out.println("max_sum:" + Arrays.toString(max_subsequence));

	}

}


