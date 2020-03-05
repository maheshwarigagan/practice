package hashtable.alienDict;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlienDictionaryTest {

    @Test
    public void isAlienSorted() {
        // words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
        Assert.assertTrue(AlienDictionary.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    public void isAlienSortedFalseTest() {
        // words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
        Assert.assertFalse(AlienDictionary.isAlienSorted(new String[]{"word","world","row"},"worldabcefghijkmnpqstuvxyz"));
    }

}