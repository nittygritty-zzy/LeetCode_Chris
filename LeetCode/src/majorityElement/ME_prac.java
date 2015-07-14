package majorityElement;

public class ME_prac {

	public static int majorityElement(int[] num) {
		int count = 0;
		int major = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (count == 0) {
				count++;
				major = num[i];
			} else if (major == num[i]) {
				count++;
			} else
				count--;
		}
		return major;
	}

	public static int test(int num) {

		return num = num / 2;
	}

	// core of the algorithm:
	// if count == 0, begin or start over from a new major element.
	// if new element is not a major element, count --;
	// Since the number of major element is always greater than n/2, that means,
	// the number of major element is greater than the number of non-major
	// element. That means, if the major element exits, as only as the count >
	// 0, variable major is always recording the major element

	public static void main(String[] args) {

		int[] num = { 11, 12, 11, 34, 45, 11, 11, 11, 12, 3, 34, 11, 45, 11,
				11, 11, 65, 76 };

		System.out.println("The major element is: " + majorityElement(num));

		System.out.println(test(5));
	}

}
