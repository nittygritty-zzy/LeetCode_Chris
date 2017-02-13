package titleToNumber;

public class TitleToNumber {

	public static int titleToNumber(String s) {

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = sum * 26 + ((int) s.charAt(i) - (int) 'A' + 1); // 强制转换 char
																	// to int,
																	// and
			// A = 65
		}
		return sum;
	}

	public static int test(char s) {
		return (int) s;
	}

	public static void main(String[] args) {

		System.out.println(titleToNumber("AA"));

	}

}
