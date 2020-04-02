package arrays.boatstosavepeople;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoatsToSavePeopleTest {

    @Test
    public void numRescueBoats() {
        Assert.assertEquals(4, BoatsToSavePeople.numRescueBoats(new int[]{3,5,3,4},5));
    }
}