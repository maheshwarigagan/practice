package arrays.palindromicsubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringTest {

    @Test
    public void countSubstrings() {
        Assert.assertEquals(6, PalindromicSubstring.countSubstrings("aaa"));
    }

    @Test
    public void countSubstringsSecondTest() {
        Assert.assertEquals(3, PalindromicSubstring.countSubstrings("abc"));
    }
}