package countBattleships_419;

/**
 * Created by Apple on 2/16/17.
 */

public class Solution2 {
    public int countBattleships(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) return 0;
        int R = board.length, C = board[0].length, cnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.'))
                    cnt++;
            }
        }
        return cnt;
    }

    /*...Note...
For a statement like if (A && B && C), when A is false, the program will not compute B and C.
So, for the best performance, we write the program in this way, instead of using a lot of if statements.*/
}
