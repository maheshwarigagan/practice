package dynamicProgramming.minpathsum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPathSumTest {

    @Test
    public void minPathSum() {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        Assert.assertEquals(7, MinimumPathSum.minPathSum(grid));
    }
}