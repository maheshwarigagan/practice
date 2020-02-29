package arrays.lics;

public class LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int current = 1;
        int longest = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                current++;
            }else{
                current = 1;
            }

            longest = Math.max(longest, current);
        }
        return longest;
    }
}
