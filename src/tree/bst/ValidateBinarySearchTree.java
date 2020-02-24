package tree.bst;

import tree.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    private boolean validate(TreeNode root, Integer minimum, Integer maximum){
        if(root == null){
            return true;
        }
        if(minimum != null && minimum>=root.val || maximum != null && maximum<=root.val){
            return false;
        }
        return validate(root.left, minimum, root.val) && validate(root.right, root.val, maximum);
    }
}
