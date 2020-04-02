package arrays.longestsswithatmosttwochars;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithAtMostTwoDistinctCharactersTest {

    @Test
    public void lengthOfLongestSubstringTwoDistinct() {
        Assert.assertEquals(5, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }
}