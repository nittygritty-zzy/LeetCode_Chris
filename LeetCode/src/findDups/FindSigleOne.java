package findDups;

public class FindSigleOne {

	// create a result, use all element in array A XOR together, the same
	// element will result in 0, the non-duplicated element result in itself.

	static int singleNumber(int A[], int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result ^= A[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 2, 3, 4 };

		System.out.println(singleNumber(a, 7));
	}
}
