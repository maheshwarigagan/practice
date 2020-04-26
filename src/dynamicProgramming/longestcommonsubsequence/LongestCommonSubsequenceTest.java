package dynamicProgramming.longestcommonsubsequence;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequence() {
        Assert.assertEquals(3, LongestCommonSubsequence.longestCommonSubsequence("abcde","ace"));
    }
}