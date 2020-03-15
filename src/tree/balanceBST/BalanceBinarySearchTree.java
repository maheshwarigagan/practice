package tree.balanceBST;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/balance-a-binary-search-tree/
public class BalanceBinarySearchTree {

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        performInorderTraversal(root, inorder);
        return helper(inorder, 0, inorder.size()-1);
    }

    private TreeNode helper(List<Integer> input, int start, int end){
        if(end<start){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode current = new TreeNode(input.get(mid));
        current.left = helper(input, start, mid-1);
        current.right = helper(input, mid+1, end);
        return current;
    }

    private void performInorderTraversal(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        performInorderTraversal(node.left, list);
        list.add(node.val);
        performInorderTraversal(node.right, list);
    }

}
