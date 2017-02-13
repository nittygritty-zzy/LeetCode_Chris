package twoSum;

import java.util.Arrays;

//Already Sorted:
//O(nlogn) runtime, O(1) space
public class Solution4 {
	public int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int j = bsearch(numbers, target - numbers[i], i + 1);
			if (j != -1) {
				return new int[] { i + 1, j + 1 };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	private int bsearch(int[] A, int key, int start) {
		int L = start, R = A.length - 1;
		while (L < R) {
			int M = (L + R) / 2;
			if (A[M] < key) {
				L = M + 1;
			} else {
				R = M;
			}
		}
		return (L == R && A[L] == key) ? L : -1;
	}
	public static void main(String[] args){
		Solution4 ts = new Solution4();
		int[] numbers = {1,2,3,4,5,6};
		int[] result = ts.twoSum(numbers, 7);
		System.out.println(Arrays.toString(result));
	}
}
