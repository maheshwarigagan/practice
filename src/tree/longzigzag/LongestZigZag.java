package tree.longzigzag;

import tree.TreeNode;

public class LongestZigZag {
    int result = 0;
    public int longestZigZag(TreeNode root) {
        longest(root, true);
        return result;
    }

    private int longest(TreeNode root, boolean left){
        if(root == null){
            return 0;
        }
        int l = longest(root.left, false);
        int r = longest(root.right, true);

        result = Math.max(result, l);
        result = Math.max(result, r);

        return 1+(left? l:r);
    }
}
