package palindrome;

public class ValidePalindrom {
	
	public static Boolean ValidePalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		return new StringBuilder(s).reverse().toString().equals(s);
	}
	public static void main(String[] args){
		System.out.println(ValidePalindrome("(*(&*^a(*b)a"));
	}
}
