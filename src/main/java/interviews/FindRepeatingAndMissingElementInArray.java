package interviews;

import java.util.Arrays;


/**
 * @author Sachin.Rane
 * Nov 12, 2019
 */
public class FindRepeatingAndMissingElementInArray {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 1, 5, 5, 6, 2 };
		
		int[] temp = new int[arr.length+1];
		
		Arrays.fill(temp, 0);
		
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(temp));
		
		int repeated = 0, missing = 0;
		for (int i = 1; i < temp.length; i++) {
			if(temp[i] == 0) {
				missing = i;
			}
			if (temp[i] == 2) {
				repeated = i;
			}
		}
		

		System.out.println("repeated:"+ repeated + " and missing: "+ missing );
	}

}
