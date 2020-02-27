package linkedList;

public class TestUtils {

    public static ListNode generateLinkedList(int[] input){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for(int n:input){
            head.next = new ListNode(n);
            head = head.next;
        }
        return dummy.next;
    }

}
