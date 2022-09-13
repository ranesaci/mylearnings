package interviews;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
		System.out.println("Given Array" + Arrays.toString(intArr));
		//boolean reverse = true;
		boolean reverse = false;
		
		for (int i = 0; i < intArr.length-1; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				
				if (reverse == true) {
					if (intArr[i] < intArr[j]) {
						swap(intArr,i,j);
					}
				} else {
					if (intArr[i] > intArr[j]) {
						swap(intArr,i,j);
					}
				}
			}
		}
		
		System.out.println("Sorted Array" + Arrays.toString(intArr));
	}

	private static void swap(int[] intArr, int i, int j) {
		int temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;
		
	}

}
