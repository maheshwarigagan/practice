package graph.jumpgameiii;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameThreeTest {

    @Test
    public void canReach() {
        Assert.assertTrue(JumpGameThree.canReach(new int[]{4,2,3,0,3,1,2}, 5));
    }
}