package longestPalindromeSubseq_516;

/**
 * Created by Apple on 2/20/17.
 */
public class Solution {
    public int longestPalindromeSubseq(String s) {

        /*
        dp[i][j]: the longest palindromic subsequence's length of substring(i, j)
        State transition:
        dp[i][j] = dp[i+1][j-1] + 2 if s.charAt(i) == s.charAt(j)
        otherwise, dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1])
        Initialization: dp[i][i] = 1
        */
        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
            /*
            j need start from i + 1 cause in dp[][j - 1] when i = 0
            */
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
