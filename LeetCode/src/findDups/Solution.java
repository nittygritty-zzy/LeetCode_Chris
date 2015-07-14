package findDups;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsDuplicate2(int[] nums) {
		final Set<Integer> distinct = new HashSet<Integer>();
		for (int num : nums) {
			if (distinct.contains(num)) {
				return true;
			}
			distinct.add(num);
		}
		return false;
	}

	public static boolean containsDuplicate3(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 3, 4 };
		boolean result = containsDuplicate(nums);
		boolean result2 = containsDuplicate2(nums);
		boolean result3 = containsDuplicate2(nums);

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
