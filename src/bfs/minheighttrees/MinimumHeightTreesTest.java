package bfs.minheighttrees;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumHeightTreesTest {

    @Test
    public void findMinHeightTrees() {
        int[][] edges = new int[][]{{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
        Assert.assertTrue(MinimumHeightTrees.findMinHeightTrees(6, edges).contains(3));
        Assert.assertTrue(MinimumHeightTrees.findMinHeightTrees(6, edges).contains(4));
    }
}