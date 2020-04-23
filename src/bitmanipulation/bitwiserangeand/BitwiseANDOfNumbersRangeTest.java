package bitmanipulation.bitwiserangeand;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitwiseANDOfNumbersRangeTest {

    @Test
    public void rangeBitwiseAnd() {
        Assert.assertEquals(4, BitwiseANDOfNumbersRange.rangeBitwiseAnd(5,7));
    }
}