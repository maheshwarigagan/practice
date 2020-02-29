package arrays.lics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void findLengthOfLCIS() {
        Assert.assertEquals(3, LongestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void findLengthOfLCISElementsEqual() {
        Assert.assertEquals(1, LongestContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{3,3,3,3,3}));
    }
}