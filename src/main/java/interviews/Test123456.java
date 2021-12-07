package interviews;
import java.util.Arrays;

/**
* @author sachin
* @date 12-Nov-2021
*/

public class Test123456 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4, 10,5,6};
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i]; //1
			arr[i] = arr[arr.length-1-i];//6
			arr[arr.length-1-i] = temp;//1
			
		}
		
		System.out.println(Arrays.toString(arr));
//		
//		int arr[] = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1};
//		int maxLength = 0;
//		
////		for (int i = 0; i < arr.length; i++) {
////			if (arr[i] == 1) {
////				
////				int start = i;
////				for (int j = i+1; j < arr.length; j++) {
////					if (arr[j] == 1) {
////						
////					}
////				}
////				
////			} else {
////				continue;
////			}
////			
////		}
//		
//		int 
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
//		
		

	}
	
	

	

}


