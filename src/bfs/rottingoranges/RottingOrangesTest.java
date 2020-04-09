package bfs.rottingoranges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RottingOrangesTest {

    @Test
    public void orangesRotting() {
        int[][] input = new int[][] {{2,1,1},{1,1,0},{0,1,1}};
        Assert.assertEquals(4, RottingOranges.orangesRotting(input));
    }

    @Test
    public void orangesRottingNotPossibleTest() {
        int[][] input = new int[][] {{2,1,1},{0,1,1},{1,0,1}};
        Assert.assertEquals(-1, RottingOranges.orangesRotting(input));
    }
}