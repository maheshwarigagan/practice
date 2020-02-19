package arrays.nondecreasingarray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonDecreasingArrayTest {

    @Test
    public void checkPossibility() {
        Assert.assertTrue(NonDecreasingArray.checkPossibility(new int[]{4,1,7,8}));
    }

    @Test
    public void checkPossibilityFalse() {
        Assert.assertFalse(NonDecreasingArray.checkPossibility(new int[]{4,1,7,6}));
    }
}