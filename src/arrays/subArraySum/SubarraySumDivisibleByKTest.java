package arrays.subArraySum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySumDivisibleByKTest {

    @Test
    public void subarraysDivByK() {
        Assert.assertEquals(7, SubarraySumDivisibleByK.subarraysDivByK(new int[]{4,5,0,-2,-3,1},5));
    }
}