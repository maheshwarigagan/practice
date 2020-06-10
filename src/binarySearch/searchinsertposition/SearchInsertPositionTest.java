package binarySearch.searchinsertposition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        int[] input = new int[]{1,3,5,6};
        Assert.assertEquals(2, SearchInsertPosition.searchInsert(input, 5));
        Assert.assertEquals(1, SearchInsertPosition.searchInsert(input, 2));
        Assert.assertEquals(4, SearchInsertPosition.searchInsert(input, 7));
        Assert.assertEquals(0, SearchInsertPosition.searchInsert(input, 0));

    }
}