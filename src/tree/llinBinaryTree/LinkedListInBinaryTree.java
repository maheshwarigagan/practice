package tree.llinBinaryTree;

import linkedList.ListNode;
import tree.TreeNode;

public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null)
            return false;
        return hasPath(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean hasPath(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }

        if(root == null){
            return false;
        }
        if(head.val != root.val){
            return false;
        }

        return hasPath(head.next, root.left) || hasPath(head.next, root.right);
    }
}
