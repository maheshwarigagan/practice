public class Solution {
    // https://leetcode.com/problems/maximum-subarray/
    public static void main(String args[]){
//        System.out.println("hello");
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    // Question to be answered for each element, whether
    // the current element should be included in the maximum sub array so far or
    // is it greater than that sum.
    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int[] subProblems = new int[nums.length];
        subProblems[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            subProblems[i] = Math.max(nums[i], nums[i]+subProblems[i-1]);
            max = Math.max(max, subProblems[i]);
        }
        return max;
    }

}
