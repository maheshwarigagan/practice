package backspacestringcompare;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceStringCompareTest {

    @Test
    public void backspaceCompare() {
        Assert.assertFalse(BackspaceStringCompare.backspaceCompare("a#c","b"));
        Assert.assertTrue(BackspaceStringCompare.backspaceCompare("ab#c", "ad#c"));

    }
}