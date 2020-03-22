package arrays.maxLengthConcatenatedString;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaximumLengthConcatenatedStringUniqueCharactersTest {

    @Test
    public void maxLength() {
        List<String> input  = new ArrayList<>();
        input.add("cha");
        input.add("r");
        input.add("act");
        input.add("ers");
        Assert.assertEquals(6,MaximumLengthConcatenatedStringUniqueCharacters.maxLength(input));
    }
}