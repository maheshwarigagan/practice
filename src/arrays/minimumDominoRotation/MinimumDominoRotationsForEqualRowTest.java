package arrays.minimumDominoRotation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDominoRotationsForEqualRowTest {

    @Test
    public void minDominoRotations() {
        int[] a = new int[]{2,1,2,4,2,2};
        int[] b = new int[]{5,2,6,2,3,2};
        Assert.assertEquals(2, MinimumDominoRotationsForEqualRow.minDominoRotations(a,b));
    }
}