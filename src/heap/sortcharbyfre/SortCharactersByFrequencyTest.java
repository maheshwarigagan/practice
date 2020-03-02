package heap.sortcharbyfre;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortCharactersByFrequencyTest {

    @Test
    public void frequencySort() {
        Assert.assertEquals("eert",SortCharactersByFrequency.frequencySort("tree"));
    }

    @Test
    public void frequencySortUpperAndLowCaseTest() {
        Assert.assertEquals("bbAa",SortCharactersByFrequency.frequencySort("Aabb"));
    }
}