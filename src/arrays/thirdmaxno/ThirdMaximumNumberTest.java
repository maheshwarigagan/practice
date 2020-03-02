package arrays.thirdmaxno;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdMaximumNumberTest {

    @Test
    public void thirdMax() {
        Assert.assertEquals(1, ThirdMaximumNumber.thirdMax(new int[]{3,2,1}));
    }

    @Test
    public void thirdMaxWithLessThanThreeElements() {
        Assert.assertEquals(3, ThirdMaximumNumber.thirdMax(new int[]{3,2}));
    }
}