package arrays.setmatzero;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetMatrixZeroesTest {

    @Test
    public void setZeroes() {
        int[][] input = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroes.setZeroes(input);
        int[][] expectedOutput = new int[][]{{1,0,1},{0,0,0},{1,0,1}};
        Assert.assertArrayEquals(expectedOutput, input);
    }
}