package graph.pathwithminmaxval;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathWithMaximumMinimumValueTest {

    @Test
    public void maximumMinimumPath() {
        int[][] input = new int[][]{{5,4,5},{1,2,6},{7,4,6}};
        Assert.assertEquals(4, PathWithMaximumMinimumValue.maximumMinimumPath(input));
    }
}