package greedy.subsequence;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence() {
        Assert.assertTrue(IsSubsequence.isSubsequence("abc", "ahbgdc"));
        Assert.assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}