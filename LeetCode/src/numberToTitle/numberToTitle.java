package numberToTitle;

public class numberToTitle {
	public static String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			n--;
			result.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}
		return result.toString();
	}
	
	public static void main(String[] args) {


		System.out.println("Converted number is: " + convertToTitle(4235243));
	}
	
}
