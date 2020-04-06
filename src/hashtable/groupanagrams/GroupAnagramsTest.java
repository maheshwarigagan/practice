package hashtable.groupanagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = new ArrayList<>();

        expected.add(List.of("eat", "tea", "ate"));
        expected.add(List.of("bat"));
        expected.add(List.of("tan", "nat"));

        for(List<String> l:GroupAnagrams.groupAnagrams(strs)){
            Assert.assertTrue(expected.contains(l));
        }
    }
}