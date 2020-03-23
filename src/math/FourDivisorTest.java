package math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourDivisorTest {

    @Test
    public void sumFourDivisors() {
        Assert.assertEquals(32, FourDivisor.sumFourDivisors(new int[]{21,4,7}));
    }
}