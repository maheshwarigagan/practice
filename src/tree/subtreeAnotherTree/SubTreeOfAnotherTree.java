package tree.subtreeAnotherTree;

import tree.TreeNode;

// https://leetcode.com/problems/subtree-of-another-tree/
public class SubTreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        return check(s,t) || isSubtree(s.left,t) || isSubtree(s.right, t);
    }
    private boolean check(TreeNode s, TreeNode t){
        if(s==null && t==null){
            return true;
        }
        if(s==null || t==null){
            return false;
        }

        if(s.val == t.val){
            return check(s.left, t.right) && check(s.right, t.right);
        }else{
            return false;
        }
    }
}