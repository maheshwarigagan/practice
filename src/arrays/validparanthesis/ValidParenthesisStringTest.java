package arrays.validparanthesis;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisStringTest {

    @Test
    public void checkValidString() {
        Assert.assertTrue(ValidParenthesisString.checkValidString("(*))"));
    }
}