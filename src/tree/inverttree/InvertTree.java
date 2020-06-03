package tree.inverttree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
    public TreeNode invertTreeRecursive(TreeNode root) {
         if(root == null){
             return null;
         }
         TreeNode left = invertTreeRecursive(root.left);
         TreeNode right = invertTreeRecursive(root.right);
         root.left = right;
         root.right = left;
         return root;
    }

    public TreeNode invertTreeIterative(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.right != null) queue.add(current.right);
            if (current.left != null) queue.add(current.left);
        }
        return root;
    }
}
