package linkedList.SwapNodes;

import linkedList.ListNode;

// https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(head != null && head.next != null){

            ListNode firstNode = head;
            ListNode secondNode = head.next;

            //swap
            prev.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            //jump
            prev = firstNode;
            head = prev.next;
        }
        return dummy.next;
    }
}
