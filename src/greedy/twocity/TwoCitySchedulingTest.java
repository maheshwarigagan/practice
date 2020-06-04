package greedy.twocity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoCitySchedulingTest {

    @Test
    public void twoCitySchedCost() {
        int[][] costs = new int[][] {{10,20},{30,200},{400,50},{30,20}};
        Assert.assertEquals(110, TwoCityScheduling.twoCitySchedCost(costs));
    }
}