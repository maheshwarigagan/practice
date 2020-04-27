package dynamicProgramming.maximalsquare;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquareTest {

    @Test
    public void maximalSquare() {
        char[][] input = new char[][]{{'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1', '0', '0', '1', '0'}};
        Assert.assertEquals(4, MaximalSquare.maximalSquare(input));
    }
}