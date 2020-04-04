package arrays.movezeroes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] input = new int[]{0,1,0,3,12};
        MoveZeroes.moveZeroes(input);
        int[] output = new int[]{1,3,12,0,0};
        Assert.assertArrayEquals(output,input);
    }
}