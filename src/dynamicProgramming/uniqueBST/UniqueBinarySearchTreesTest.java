package dynamicProgramming.uniqueBST;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesTest {

    @Test
    public void numTrees() {
        Assert.assertEquals(5, UniqueBinarySearchTrees.numTrees(3));
        Assert.assertEquals(14, UniqueBinarySearchTrees.numTrees(4));
    }
}