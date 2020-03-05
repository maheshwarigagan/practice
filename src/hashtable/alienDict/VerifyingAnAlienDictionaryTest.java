package hashtable.alienDict;

import org.junit.Assert;
import org.junit.Test;

public class VerifyingAnAlienDictionaryTest {

    @Test
    public void isAlienSorted() {
        // words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
        Assert.assertTrue(VerifyingAnAlienDictionary.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    public void isAlienSortedFalseTest() {
        // words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
        Assert.assertFalse(VerifyingAnAlienDictionary.isAlienSorted(new String[]{"word","world","row"},"worldabcefghijkmnpqstuvxyz"));
    }

}