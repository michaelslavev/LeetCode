package LeetCode75.Level1;

public class Q_724 {
	public int pivotIndex(int[] nums) {
		int leftSum = 0;

		if(nums.length < 2) {
			return 0;
		}

		for(int i = 0; i < nums.length; i++) {
			int rightSum = 0;

			if(i != 0) leftSum += nums[i-1];

			for(int j = i+1; j < nums.length; j++) {
				rightSum += nums[j];
			}

			if(leftSum == rightSum) return i;
		}
		return -1;
	}
}
