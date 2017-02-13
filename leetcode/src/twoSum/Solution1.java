package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (map.containsKey(target - x)) {
				return new int[] { map.get(target - x) + 1, i + 1 };
			}
			map.put(x, i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
// test cases:
	public static void main(String[] args) {
		int[] numbers = { 2,4,6,4 };

		Solution1 ts = new Solution1();
		System.out.println("The result is: " + Arrays.toString(ts.twoSum(numbers, 10)));
	}
}
