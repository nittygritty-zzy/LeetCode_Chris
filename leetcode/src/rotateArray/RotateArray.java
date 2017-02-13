package rotateArray;

import java.util.Arrays;

/*
 * [9, 8, 7, 6, 5, 4, 3, 2, 1]
 * [6, 7, 8, 9, 5, 4, 3, 2, 1]
 * [6, 7, 8, 9, 1, 2, 3, 4, 5]
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) {
		if (nums.length <= 1) {
			return;
		}
		// step each time to move
		int step = k % nums.length;
		reverse(nums, 0, nums.length - 1);

		reverse(nums, 0, step - 1);

		reverse(nums, step, nums.length - 1);

	}

	// reverse int array from n to m
	// XOR swap algorithm
	// https://en.wikipedia.org/wiki/XOR_swap_algorithm
	public static void reverse(int[] nums, int n, int m) {
		while (n < m) {
			nums[n] ^= nums[m];
			nums[m] ^= nums[n];
			nums[n] ^= nums[m];
			n++;
			m--;
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] nums3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		// test the rotate func
		// System.out.println(Arrays.toString(nums1));
		// rotate(nums1, 4);
		// System.out.println(Arrays.toString(nums1));

		// test the reverse func
		// System.out.println(Arrays.toString(nums2));
		// reverse(nums2, 4, 8);
		// System.out.println(Arrays.toString(nums2));

		rotate(nums3, 4);

	}
}