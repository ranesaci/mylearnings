package java8;

import java.util.Arrays;

public class ChangeBinary {
	
	
	public static void main(String[] args) {
		
		int data = state(8,9);
		System.out.println(data);

	}

	private static int state(int index, int sweeps) {
		int x = 9;
		int[] arr = new int[x];
		Arrays.fill(arr, 0);//fill all 0s first
		
		for (int i = 0; i < sweeps; i++) {
			
			int count = 0;
			while (count < sweeps) {
				count = count+i;
				if (count >= sweeps) {
					break;
				}
				int temp = arr[count];
				if (temp == 0) {
					temp = 1;
				} else if (temp == 1) {
					temp = 0;
				}
				arr[count] = temp;
				count++;
			}
			
				System.out.println(i+1 +" iteration: "+ Arrays.toString(arr));
			}
			
		return arr[index];
	}

}
