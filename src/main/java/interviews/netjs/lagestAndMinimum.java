package interviews.netjs;

import java.util.Arrays;

public class lagestAndMinimum {

	public static void main(String[] args) {
		int[] nums = {1,3,5,2,4,1,5,7,9,4};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			} else if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		System.out.println("given array:" + Arrays.toString(nums));
		System.out.println("min:"+min + " and max:" + max);

	}

}
