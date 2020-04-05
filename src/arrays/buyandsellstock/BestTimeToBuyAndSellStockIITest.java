package arrays.buyandsellstock;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIITest {

    @Test
    public void maxProfit() {
        Assert.assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}