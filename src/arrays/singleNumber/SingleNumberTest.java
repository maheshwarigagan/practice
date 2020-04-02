package arrays.singleNumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(1, SingleNumber.singleNumber(new int[]{1,2,2,3,3,4,5,5,4}));
    }
}