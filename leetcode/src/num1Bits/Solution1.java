package num1Bits;

public class Solution1 {
	static int hammingWeight(int n) {
		int ones = 0;
		while (n != 0) {
			ones = ones + (n & 1);
			// System.out.println(n);
			n >>>= 1;
		}
		System.out.println("---------");
		return ones;

	}

	// Second solution don't need iterate all the 32-bit integer.
	static int hammingWeight2(int n) {
		int result = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				result++;
			}
			n >>>= 1;
		}
		return result;
	}

	static int hammingWeight3(int n) {

		return n == 0 || n == 1 ? n : (n & 1) + hammingWeight3(n >>> 1);

	}

	// you need to treat n as an unsigned value, faster that if((n&1) ==
	// 1){result ++}
	static int hammingWeight4(int n) {
		int count = 0;
		while (n != 0) {
			System.out.println("n 		= " + Integer.toBinaryString(n) + "	=	" + n);
			System.out.println("(n - 1) 	= " + Integer.toBinaryString(n - 1) + "	=	" + n);
			n = n & (n - 1);
			System.out.println("n & (n - 1) 	= " + Integer.toBinaryString(n) + "	=	" + n);
			count++;
			System.out.println("---------");
		}
		return count;
	}

	/*
	 * 
	 * what's the different between
	 * 
	 * if ((n & 1) == 1) { result++; } n >>>= 1;
	 * 
	 * vs
	 * 
	 * n = n & (n - 1) count++
	 * 
	 * n average second approach works works faster. Ex: n = 9; With first
	 * approach you need 4 iterations to count number of bits, while only 2
	 * iterations with second.
	 */

	public static void main(String[] args) {

		// System.out.println(hammingWeight(435));
		// System.out.println(hammingWeight2(435));
		System.out.println(hammingWeight4(1431));
	}
}
