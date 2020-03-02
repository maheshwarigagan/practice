package linkedList.intersection;

import linkedList.ListNode;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Find the longer list
        int lengthA = findLength(headA);
        int lengthB = findLength(headB);
        ListNode currA = headA;
        ListNode currB = headB;

        if(lengthA > lengthB){
            int diff = lengthA-lengthB;
            while(diff > 0){
                currA = currA.next;
                diff--;
            }
        }else{
            int diff = lengthB-lengthA;
            while(diff > 0){
                currB = currB.next;
                diff--;
            }
        }

        while(currA != null && currB != null){
            if(currA == currB){
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }
    private int findLength(ListNode node){
        int length = 0;
        while(node != null){
            length++;
            node = node.next;
        }
        return length;
    }
}
