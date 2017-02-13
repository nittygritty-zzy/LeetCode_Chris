package happyNumber;

public class happyNumberII {
	public static boolean isHappy(int n) {
		if (n < 0)
			return false;
		int sum = 0;
		while (true) {
			if (sum == 1)
				return true;
			else {
				while (n > 0) {
					sum += (n % 10) * (n % 10);
					n /= 10;
				}
				n = sum;
				System.out.println(sum);
			}
		}
	}
	
	public static void main(String[] args) {
		// System.out.println(isHappy(3));
		System.out.println(isHappy(19));
	}
}
