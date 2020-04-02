package linkedList.cycle;

import linkedList.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slowRunner = head;
        ListNode fastRunner = head.next;

        while(slowRunner!=fastRunner){
            if(fastRunner==null || fastRunner.next == null){
                return false;
            }
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        return true;

    }
}
