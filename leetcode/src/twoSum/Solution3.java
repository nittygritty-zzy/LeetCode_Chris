package twoSum;

import java.util.Arrays;

public class Solution3 {
	public int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args){
		int[]  numbers = {1,2,3,4,5,6};
		Solution3 ts = new Solution3();
		System.out.println(Arrays.toString(ts.twoSum(numbers, 8)));
	}
}
