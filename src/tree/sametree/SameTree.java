package tree.sametree;

import tree.TreeNode;

// https://leetcode.com/problems/same-tree/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
    private boolean check(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val == q.val && check(p.left,q.left) && check(p.right, q.right);
    }
}