package threeSumClosest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static int threeSumCloset(int[] num, int target) {
		int result = num[0] + num[1] + num[num.length - 1];
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			int start = i + 1, end = num.length - 1;
			while (start < end) {
				int sum = num[i] + num[start] + num[end];
				if (sum > target) {
					end--;
				} else
					start++;
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}
		return result;
	}

	public static List<List<Integer>> threeSumClosetII(int[] num, int target) {
		int result = num[0] + num[1] + num[num.length - 1];
		Arrays.sort(num);
		List<List<Integer>> result2 = new LinkedList<List<Integer>>();
		for (int i = 0; i < num.length - 2; i++) {
			int start = i + 1, end = num.length - 1;
			while (start < end) {
				int sum = num[i] + num[start] + num[end];
				if (sum > target)
					end--;
				else
					start++;
				if (Math.abs(target - sum) < Math.abs(target - result)){
					result = sum;
				}
			}
			
		}
		return result2;
	}

	public static void main(String[] args) {
		int[] num = { -1, 0, 1, 2, -1, -4 };

		System.out.println(threeSumClosetII(num, 4));
	}
}
