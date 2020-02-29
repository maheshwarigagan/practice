package dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestArithmeticSequenceTest {

    @Test
    public void longestArithSeqLength() {
        Assert.assertEquals(4, LongestArithmeticSequence.longestArithSeqLength(new int[]{20,1,15,3,10,5,8}));
    }
}