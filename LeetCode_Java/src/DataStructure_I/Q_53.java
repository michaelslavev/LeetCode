package DataStructure_I;

public class Q_53 {
	public int maxSubArray(int[] nums) {
		int currSum = 0;
		int max = nums[0];

		for(int i=0; i < nums.length; i++) {

			currSum += nums[i];

			if (currSum < nums[i]) {
				currSum = nums[i];
			}

			if (max < currSum) {
				max = currSum;
			}

		}
		return max;
	}
}
