package arrays.gol;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test
    public void gameOfLife() {
        int[][] input = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        GameOfLife.gameOfLife(input);
        int[][] output = new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        Assert.assertArrayEquals(input, output);
    }
}