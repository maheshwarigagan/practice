package dynamicProgramming.rangequery;

// https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {
    int nums[];
    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            this.nums[i] = sum;
        }

    }

    public int sumRange(int i, int j) {
        return i==0 ? nums[j] : nums[j]-nums[i-1];
    }
}
