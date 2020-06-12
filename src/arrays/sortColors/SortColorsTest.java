package arrays.sortColors;

import heap.sortcharbyfre.SortCharactersByFrequency;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortColorsTest {

    @Test
    public void sortColors() {
        int[] input = new int[]{2,0,2,1,1,0};
        int[] output = new int[]{0,0,1,1,2,2};
        SortColors.sortColors(input);
        Assert.assertArrayEquals(output, input);
    }
}