package arrays.fruitinbasket;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FruitIntoBasketsTest {

    @Test
    public void totalFruit() {
        Assert.assertEquals(5, FruitIntoBaskets.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}