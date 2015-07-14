package primeNumber;

import java.util.BitSet;

public class CountPrimes {

	public static int countPrimes2(int n) {

		if (n <= 1) {
			return 0;
		}

		BitSet set = new BitSet(n);
		set.set(0, 2);

		for (int i = 2; i < n; i++) {
			if (!set.get(i)) {
				for (int j = i * 2; j < n; j += i) {
					set.set(j);
				}
			}

		}

		return n - set.cardinality();
	}

	public static int countPrimes(int n) {
		int count = 0;
		if (n < 2) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		for (int n = 2; n < 100; n++) {
			System.out.println("n = " + n);
			System.out.println("first: " + countPrimes(n));
			System.out.println("second: " + countPrimes2(n));
			System.out.println("____________");
		}
	}

}
