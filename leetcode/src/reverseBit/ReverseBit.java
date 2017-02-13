package reverseBit;

public class ReverseBit {
	public static int reverseBits(int n) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result += (n & 1);
			n >>= 1;
			if (i < 31) {
				result <<= 1;
			}
			System.out.println(Integer.toBinaryString(result));
			System.out.println(Integer.toBinaryString(n));
		}
		return result;

	}

	public static void main(String[] args) {

		System.out.println(reverseBits(43261596));
	}
}
