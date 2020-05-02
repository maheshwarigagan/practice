package hashtable.JewelsStones;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() {
        Assert.assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
    }
}