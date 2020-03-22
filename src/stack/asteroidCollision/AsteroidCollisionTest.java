package stack.asteroidCollision;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsteroidCollisionTest {

    @Test
    public void asteroidCollision() {
        int[] expected = new int[]{};
        Assert.assertEquals(expected, AsteroidCollision.asteroidCollision(new int[]{8,-8}));
    }

    @Test
    public void asteroidCollisionWithNoCollisionPossibleTest(){
        int[] inputOutputSame = new int[]{-2,-1,1,2};
        Assert.assertArrayEquals(inputOutputSame, AsteroidCollision.asteroidCollision(inputOutputSame));
    }
}