package interviews;

import java.util.Arrays;

/**
* @author sachin
* @date 15-Oct-2021
*/

public class MaxSubArrayWithSumZero {

	public static void main(String[] args) {
		int[] arr = {3,2,1,1,0,-2,1,3,-5,1,2,1,4};
		
		int result  = compute(arr);
		System.out.println(result);

	}

	private static int compute(int[] arr) {
		int max_length = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				sum += arr[j];
				if (sum == 0 && (j-i+1) > max_length) {
					max_length = j-i+1;
					System.out.println("i : j  = " + i + " : " + j);
					System.out.println("arr[i] : arr[j] = " + arr[i] + " : " +arr[j]);
					System.out.println("subarray:"+ Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
				}
			}
		}
		
		return max_length;
	}

}


