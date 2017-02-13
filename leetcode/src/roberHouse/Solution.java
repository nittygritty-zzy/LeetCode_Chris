package roberHouse;

public class Solution {

	public static int Max(int a, int b) {
		return a > b ? a : b;
	}

	public static int rob(int[] nums) {
		int even = 0;
		int odd = 0;

		if (nums.length % 2 == 0) {
			int even1 = 0;
			int even2 = 0;

			for (int i = 0; i < nums.length - 1; i = i + 2) {

				even1 += nums[i];
			}
			for (int i = 1; i < nums.length; i = i + 2) {

				even2 += nums[i];
			}
			even = Max(even1, even2);

		} else {
			for (int i = 0; i < nums.length; i = i + 2) {

				odd += nums[i];
			}
		}
		return Max(even, odd);
	}

	public static int rob2(int num[]) {
		int a = 0;
		int b = 0;

		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				a = Max(a + num[i], b);
				System.out.println("i = " + i);
			} else {
				b = Max(a, b + num[i]);
				System.out.println("i = " + i);
			}
			System.out.println("a = " + a + "\nb = " + b);
			System.out.println("___________");
		}
		System.out.println("a = " + a + "\nb = " + b);
		return Max(a, b);
	}

	public static int rob3(int num[]) {
		int a = 0;
		int b = 0;

		for (int i = num.length - 1; i > 0; i--) {
			if (i % 2 == 0) {
				a = Max(a + num[i], b);
				System.out.println("i = " + i);
			} else {
				b = Max(a, b + num[i]);
				System.out.println("i = " + i);
			}
			System.out.println("a = " + a + "\nb = " + b);
			System.out.println("___________");
		}
		System.out.println("a = " + a + "\nb = " + b);
		return Max(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] robs = { 2, 4, 4, 2 };
		System.out.println(rob2(robs));
	}

}
