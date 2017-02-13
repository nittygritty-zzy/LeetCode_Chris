package nextGreaterElement;

/**
 * Created by Apple on 2/12/17.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        /*
        * findNums: [1,4,5,3,7,9,6,2]
        * nums: [8,5,2,6]
        * map: [1->4,4->5,5->7,3->7,7->9]
        * nge: [-1,7,-1,-1]
        */
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // process nums to create a map using stack, the key is nums, the value is corresponding next greater number
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        // process findNums
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }

    public static void main(String[] args) {
        Solution sv = new Solution();
        sv.nextGreaterElement(new int[]{1,2,3,4}, new int[]{8,6,4,2,3,4});
    }
}
