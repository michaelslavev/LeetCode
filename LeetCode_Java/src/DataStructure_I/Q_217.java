package DataStructure_I;

import java.util.HashMap;

public class Q_217 {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> contents = new HashMap<Integer, Integer>();

		for(int i=0; i < nums.length; i++) {
			if(contents.containsKey(nums[i])) {
				return true;
			}
			else {
				contents.put(nums[i], 1);
			}

		}
		return false;
	}
}
