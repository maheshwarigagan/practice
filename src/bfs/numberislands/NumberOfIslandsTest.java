package bfs.numberislands;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    @Test
    public void numIslands() {
        char[][] grid = new char[][]{{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        Assert.assertEquals(3, NumberOfIslands.numIslands(grid));
    }
}