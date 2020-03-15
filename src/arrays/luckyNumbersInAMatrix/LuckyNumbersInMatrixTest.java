package arrays.luckyNumbersInAMatrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LuckyNumbersInMatrixTest {

    @Test
    public void luckyNumbers() {
        int[][] input = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> outputExpected = new ArrayList<>();
        outputExpected.add(15);
        Assert.assertEquals(outputExpected, LuckyNumbersInMatrix.luckyNumbers(input));
    }
}