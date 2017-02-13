package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Apple on 2/12/17.
 */


/** Given nums = [2, 7, 11, 15], target = 9,
*
* Because nums[0] + nums[1] = 2 + 7 = 9,
* return [0, 1]. */


public class Solution5 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; map.put(nums[i], ++i)){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) - 1, i};
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args){
        Solution5 ts = new Solution5();
        int[] numbers = {1,2,3,4,5,6};
        int[] result = ts.twoSum(numbers, 7);
        System.out.println(Arrays.toString(result));
    }
}