package longestPalindrome_409;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Apple on 2/14/17.
 */

public class Solution {

    //longest palindrome, find (n*even + (1 or 0)*odd) combinations
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> hs = new HashSet<>();
        int even = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hs.contains(c)) {
                hs.remove(c);
                even++;
            } else {
                hs.add(c);
            }
        }
        return hs.isEmpty() ? 2 * even : 2 * even + 1;
    }
}


