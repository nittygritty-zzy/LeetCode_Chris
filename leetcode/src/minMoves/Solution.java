package minMoves;

/**
 * Created by Apple on 2/13/17.
 */
public class Solution {
    /*incrementing n - 1 elements by 1 equals to decreasing 1 element by 1*/
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) moves += (nums[i] - min);
            if (nums[i] < min) {
                moves += i * (min - nums[i]);
                min = nums[i];
            }
        }
        return moves;
    }
}
