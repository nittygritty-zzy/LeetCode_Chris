package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = 1; j < nums.length - 2; j++) {
				int start = j + 1, end = nums.length - 1;
				int sum = target - (nums[i] + nums[j]);
				while (start < end) {
					if (start < end && nums[start] + nums[end] == sum)
						result.add(Arrays.asList(nums[i], nums[j], nums[start],
								nums[end]));
					start++;
					end--;
				}
			}

		}

		return result;
	}

	public static List<List<Integer>> fourSumII(int[] num, int target) {
		ArrayList<List<Integer>> ans = new ArrayList<>();
		if (num.length < 4)
			return ans;
		Arrays.sort(num);
		for (int i = 0; i < num.length - 3; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;
			for (int j = i + 1; j < num.length - 2; j++) {
				if (j > i + 1 && num[j] == num[j - 1])
					continue;
				int low = j + 1, high = num.length - 1;
				while (low < high) {
					int sum = num[i] + num[j] + num[low] + num[high];
					if (sum == target) {
						ans.add(Arrays.asList(num[i], num[j], num[low],
								num[high]));
						while (low < high && num[low] == num[low + 1])
							low++;
						while (low < high && num[high] == num[high - 1])
							high--;
						low++;
						high--;
					} else if (sum < target)
						low++;
					else
						high--;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] num = { 1, 0, -1, 0, -2, 2 };

		System.out.println(fourSum(num, 0));
		System.out.println(fourSumII(num, 0));
	}
}
