package linkedList.SwapNodes;

import linkedList.ListNode;
import linkedList.TestUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {

    @Test
    public void swapPairs() {
        int[] input = new int[]{1,2,3,4};
        ListNode head = TestUtils.generateLinkedList(input);
        ListNode outputHead = SwapNodesInPairs.swapPairs(head);

        int[] output = new int[]{2,1,4,3};
        for(int n:output){
            Assert.assertEquals(n, outputHead.val);
            outputHead = outputHead.next;
        }
        Assert.assertNull(outputHead);
    }

}