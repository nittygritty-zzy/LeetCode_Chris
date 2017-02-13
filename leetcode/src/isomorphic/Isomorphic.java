package isomorphic;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
	public static boolean isIsomorphic(String s, String t) {

		if (s == null || t == null) {
			return false;
		}

		if (s.length() == 0 || t.length() == 0)
			return true;

		Map<Character, Character> corr = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);

			if (corr.containsKey(sc)) {
				if (corr.get(sc) != tc) {
					return false;
				}
			} else {
				if (corr.containsValue(tc)) {
					return false;
				} else {
					corr.put(sc, tc);
				}
			}
		}
		return true;
	}

	public boolean isIsomorphic2(String s, String t) {

		if (s.length() != t.length())
			return false;
		HashMap<Character, Character> pairs = new HashMap<Character, Character>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char first = s.charAt(i);
			char second = t.charAt(i);
			if (!pairs.containsKey(first)) {
				if (!pairs.containsValue(second)) {// if doesnt contain the key
					pairs.put(first, second);
				} else {
					return false;
				}
			} else {// if contains the key
				if (pairs.get(first) == second) {// check whether it is the
													// correct key-value pair
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isIsomorphic("egg", "add"));
	}
}
