package hashtable.contiguousArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContiguousArrayTest {

    @Test
    public void findMaxLength() {
        Assert.assertEquals(4, ContiguousArray.findMaxLength(new int[]{0,1,1,0,1,1,1,0}));
    }
}