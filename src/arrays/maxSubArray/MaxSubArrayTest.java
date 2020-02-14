package arrays.maxSubArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {
    @Test
    public void getMaxSubArrayTest(){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, MaxSubArray.maxSubArray(nums));
    }

    @Test
    public void getMaxSubArrayEmptyArrayTest(){
        int[] nums = null;
        assertEquals(0, MaxSubArray.maxSubArray(nums));
    }

    @Test
    public void getMaxSubArraySingleElementTest(){
        int[] nums = new int[]{1};
        assertEquals(1, MaxSubArray.maxSubArray(nums));
    }

    @Test
    public void getMaxSubArrayAllPositiveIntegersTest(){
        int[] nums = new int[]{1,2,3,4,5};
        assertEquals(15, MaxSubArray.maxSubArray(nums));
    }

}