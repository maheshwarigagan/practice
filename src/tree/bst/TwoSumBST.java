package tree.bst;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/two-sum-bsts/
public class TwoSumBST {
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        List<Integer> tree1 = new ArrayList<>();
        createList(root1, tree1);
        List<Integer> tree2 = new ArrayList<>();
        createList(root2, tree2);
        for(int n : tree1){
            if(Collections.binarySearch(tree2, target - n) > 0){
                return true;
            }
        }
        return false;
    }

    private void createList(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        createList(root.left, list);
        list.add(root.val);
        createList(root.right, list);
    }
}
