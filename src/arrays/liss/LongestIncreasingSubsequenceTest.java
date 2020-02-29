package arrays.liss;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() {
        Assert.assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}