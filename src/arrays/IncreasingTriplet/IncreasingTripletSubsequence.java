package arrays.IncreasingTriplet;

// https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int n:nums){
            if(n <= first){
                first = n;
            }else if(n <= second){
                second = n;
            }else {
                return true;
            }
        }
        return false;
    }
}

