package binarySearch.searchtwodimensionarray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Search2DMatrixTest {

    @Test
    public void searchMatrix() {
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        Assert.assertTrue(Search2DMatrix.searchMatrix(matrix, 3));
    }
}