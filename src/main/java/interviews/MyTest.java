package interviews;
/**
* @author sachin
* @date 25-Oct-2021
*/

public class MyTest {

	public static void main(String[] args) {
		int[] arr = { 94,14, 46, 47, 94, 94, 52, 86, 36, 100, 89 };
		
		
		int max, secondMax;
		if (arr[0] < arr[1]) {
			secondMax=arr[0];
			max = arr[1];
		} else {
			max=arr[0];
			secondMax = arr[1];
		}
		
		for (int i = 2; i < arr.length; i++) {
			
			System.out.println("Max :"+ max);
			System.out.println("secondMax :"+ secondMax);
			System.out.println("-----------");
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
				System.out.println("Max :"+ max);
				System.out.println("secondMax :"+ secondMax);
			} else if (arr[i] < max && secondMax < arr[i]) {
				secondMax = arr[i];
			}
		}
		System.out.println("************");
		System.out.println("Max :"+ max);
		System.out.println("secondMax :"+ secondMax);

	}

}


