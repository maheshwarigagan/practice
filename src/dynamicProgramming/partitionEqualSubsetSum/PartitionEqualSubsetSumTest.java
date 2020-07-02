package dynamicProgramming.partitionEqualSubsetSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {

    @Test
    public void canPartition() {
        Assert.assertTrue(PartitionEqualSubsetSum.canPartition(new int[]{1, 5, 11, 5}));
        Assert.assertFalse(PartitionEqualSubsetSum.canPartition(new int[]{1, 2, 3, 5}));
    }
}