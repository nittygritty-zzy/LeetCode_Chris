package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i = 0; i < candidates.length - 1; i++){
			int sum = 0;
			int count = 0;
			while(sum < target){
				sum += candidates[i];
				List<Integer> subList = new ArrayList<Integer>();
				subList.add(candidates[i]);
			}
		}
		return res;
	}
}
