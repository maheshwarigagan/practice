package linkedList.middleofll;

import linkedList.ListNode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }
}
