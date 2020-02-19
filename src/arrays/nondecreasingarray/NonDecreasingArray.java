package arrays.nondecreasingarray;

// https://leetcode.com/problems/non-decreasing-array/
public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;

        for(int i=1;i<nums.length;i++){
            // Whenever we violate the condition of the current element being less than
            // the previous element, we increment the counter count.
            if(nums[i]<nums[i-1]){
                count++;
                // After that we have to make sure we make the some changes in the array
                // in order to make sure that the comparison we do later will give
                // the correct solution.
                // So we have two choices
                // 1. Either increase the current element
                // 2. decrease the previous element.
                // Decreasing the previous element should be our priority, given
                // increasing any element of the array will expose us to more risk.
                // Now what will decide whether to increase or decrease a value?
                // We can make previous element equal to current element if and only if, the
                // i-2 th element is also less than or equal to the current.
                // if that's not the case, we have to choose option 1.
                if(i-2 < 0 || nums[i-2]<=nums[i]){
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }

            }
        }


        return count<=1;
    }
}
