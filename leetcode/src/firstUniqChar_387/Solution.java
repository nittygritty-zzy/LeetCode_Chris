package firstUniqChar_387;

/**
 * Created by Apple on 2/16/17.
 */
public class Solution {
    public int firstUniqChar(String s) {
        /*first non-unique character, sort nlog(n)?
          need to scan the whole string, O(n);
          use map(key-> char, value->index);
          use frequency bucketing,
        */

        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
