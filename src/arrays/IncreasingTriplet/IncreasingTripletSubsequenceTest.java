package arrays.IncreasingTriplet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void increasingTriplet() {
        Assert.assertTrue(IncreasingTripletSubsequence.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    public void increasingTripletFalse() {
        Assert.assertFalse(IncreasingTripletSubsequence.increasingTriplet(new int[]{5,4,3,2,1}));
    }
}