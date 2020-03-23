package greedy.shortestwaystring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestWayToFormStringTest {

    @Test
    public void shortestWay() {
        Assert.assertEquals(3, ShortestWayToFormString.shortestWay("xyz", "xzyxz"));
    }

    @Test
    public void shortestWayNotPossible() {
        Assert.assertEquals(-1, ShortestWayToFormString.shortestWay("xyz", "txzyxz"));
    }
}