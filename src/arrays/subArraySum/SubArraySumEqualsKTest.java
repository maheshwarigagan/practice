package arrays.subArraySum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubArraySumEqualsKTest {

    @Test
    public void subarraySum() {
        Assert.assertEquals(2, SubArraySumEqualsK.subarraySum(new int[]{1,1,1}, 2));
        Assert.assertEquals(4, SubArraySumEqualsK.subarraySum(new int[]{3,4,7,2,-3,1,4,2}, 7));
    }
}