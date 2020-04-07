package hashtable.countingelement;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingElementsTest {

    @Test
    public void countElements() {
        Assert.assertEquals(2, CountingElements.countElements(new int[]{1,1,2}));
    }
}