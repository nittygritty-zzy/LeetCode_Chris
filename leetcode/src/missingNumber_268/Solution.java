package missingNumber_268;

/**
 * Created by Apple on 2/16/17.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += i;
        }
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        return nums.length - (sum2 - sum1);
    }
}

/*example:

  [0,1,2,4,5,6,7]
  [0,1,2,3,4,5,6]
  [0,0,0,1,1,1,1]


sum1 = 0+1+2+3+4+5+6 = 21, sum2 = 0+1+2+4+5+6+7 = 25
res = nums.length - (sum2 - sums1)

*/


