package arrays.assignCookies;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssignCookiesTest {

    @Test
    public void findContentChildren() {
        assertEquals(1, AssignCookies.findContentChildren(new int[]{1,2,3},new int[]{1,1}));
    }

    @Test
    public void findContentChildrenSecondTest() {
        assertEquals(2, AssignCookies.findContentChildren(new int[]{1,2},new int[]{1,2,3}));
    }
}