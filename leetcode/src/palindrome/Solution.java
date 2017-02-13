package palindrome;
//Skip non-alphanumeric characters, super easy

public class Solution {
	public boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s
					.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		Solution pd = new Solution();
		System.out.println("The result is: " + pd.isPalindrome("1(bcb1"));
	}
}
