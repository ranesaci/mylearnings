package interviews;
import java.util.Arrays;

/**
* @author sachin
* @date 26-Oct-2021
*/

public class Zemoso {

	public static void main(String[] args) {
		int[] A = {1, 4, 7, 19, 23};
		int[] B = {2, 7, 16, 51, 67};
		
		int[] result = mergeArrays(A, B);
		System.out.println(Arrays.toString(result));

	}

	private static int[] mergeArrays(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int cursor = 0;
		
		int arrayAIndex = 0;
		int arrayBIndex = 0;
		
		while (arrayAIndex < a.length && arrayBIndex < b.length) {
			
			if (a[arrayAIndex] <= b[arrayBIndex]) {
				result[cursor++] = a[arrayAIndex];
				arrayAIndex++;
			} else if (a[arrayAIndex] > b[arrayBIndex]) {
				result[cursor++] = b[arrayBIndex];
				arrayBIndex++;
			}
			
		}
		
		if (arrayAIndex < a.length && arrayBIndex >= b.length) {
			
			while (arrayAIndex <  a.length) {
				result[cursor++] = a[arrayAIndex++];
				
			}
		} else if (arrayBIndex < b.length){
			while (arrayBIndex <  b.length) {
				result[cursor++] = b[arrayBIndex++];
			}
			
		}
			return result;
	}

}


