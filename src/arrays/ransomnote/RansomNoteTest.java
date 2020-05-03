package arrays.ransomnote;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void canConstruct() {
        Assert.assertTrue(RansomNote.canConstruct("aa", "aab"));
        Assert.assertFalse(RansomNote.canConstruct("aa", "ab"));
    }
}