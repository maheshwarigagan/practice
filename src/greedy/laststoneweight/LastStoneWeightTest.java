package greedy.laststoneweight;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeightTest {

    @Test
    public void lastStoneWeight() {
        Assert.assertEquals(1, LastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
        Assert.assertEquals(0, LastStoneWeight.lastStoneWeight(new int[]{5,5,5,5,5,5}));
    }
}