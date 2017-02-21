package sumRange_303;

/**
 * Created by Apple on 2/20/17.
 */
public class NumArray {
    int[] nums;

    /*
      NumArray: {-2,0,3,-5,2,-1}
      sumArray: {-2,-2,1,-4,-2,-3}
      sumRange(0,2) = 1
      sumRange(2,5) = -3 - (-2) = -1
      sumRange(0,5) = -3
    */
    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return nums[j];
        return nums[j] - nums[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
