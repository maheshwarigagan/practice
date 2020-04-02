package arrays.longestsswithatmostkchars;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithAtMostKDistinctCharactersTest {

    @Test
    public void lengthOfLongestSubstringKDistinct() {
        Assert.assertEquals(3,LongestSubstringWithAtMostKDistinctCharacters.lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}