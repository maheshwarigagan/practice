package tree.stringroottoleaf;

import tree.TreeNode;

public class StringValidSequenceRootLeavesPathBinaryTree {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root, arr, 0);
    }

    private boolean dfs(TreeNode root, int[] arr, int index){
        if(index == arr.length-1
                && root != null
                && root.val == arr[index]
                && root.left == null
                && root.right == null){
            return true;
        }
        if(root == null || index >= arr.length){
            return false;
        }
        if(root.val == arr[index]){
            // do dfs on left and right
            return dfs(root.left, arr, index+1) || dfs(root.right, arr, index+1);
        }else{
            return false;
        }
    }
}
