package arrays.stringshift;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerformStringShiftsTest {

    @Test
    public void stringShift() {
        String s = "abcdefg";
        int[][] shift = new int[][]{{1,1},{1,1},{0,2},{1,3}};
        Assert.assertEquals("efgabcd",PerformStringShifts.stringShift(s,shift));
    }
}