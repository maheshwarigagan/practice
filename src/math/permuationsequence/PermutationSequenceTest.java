package math.permuationsequence;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationSequenceTest {

    @Test
    public void getPermutation() {
        Assert.assertEquals("2314", PermutationSequence.getPermutation(4, 9));
    }
}