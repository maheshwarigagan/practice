package arrays.spiralmatrix;

import arrays.spiralOrder.SpiralOrder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class SpiralMatrixTest {

    @Test
    public void spiralOrder() {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(6);
        expected.add(9);
        expected.add(8);
        expected.add(7);
        expected.add(4);
        expected.add(5);
        assertThat(expected, is(SpiralMatrix.spiralOrder(matrix)));
    }
}