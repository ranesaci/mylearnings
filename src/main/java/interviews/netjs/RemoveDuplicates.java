package interviews.netjs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,5,4};
		//sort and swap for unique
		System.out.println("given array:"+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("given array after sort:"+ Arrays.toString(arr));
		
		int i=0, j=1;
		
		while(j < arr.length) {
			if (arr[i] == arr[j]) {
				j++;
			} else {
				arr[++i] = arr[j++];
			}
		}
		
		int[] arr1 = Arrays.copyOf(arr, i+1);
		System.out.println("given array after remove duplicate:"+ Arrays.toString(arr1));

	}

}
