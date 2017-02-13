package removeDuplicatesFromSortedArray;

import java.util.Arrays;

// 1, non-duplicated array always smaller than duplicated array. 
// 2, two pointers, id always smaller than i
// 3, only if when nums[i] != nums[i-1], nums[id] = nums[i], id++;


public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2)
			return nums.length;
		int id = 1;
		for (int i = 1; i < nums.length; ++i) {
			if (nums[i] != nums[i - 1])
				nums[id++] = nums[i];
		}
		return id;
	}
	
	
	public static void main(String[] args){
		
		Solution a = new Solution();
		int[] nums = {1,3,3,4,4,4,5,6,7,8};
		System.out.println(a.removeDuplicates(nums));
	}
}
