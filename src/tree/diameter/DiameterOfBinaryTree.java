package tree.diameter;

import tree.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int withRoot = height(root.left, 0) + height(root.right,0);
        int onlyleft = diameterOfBinaryTree(root.left);
        int onlyRight = diameterOfBinaryTree(root.right);
        return Math.max(withRoot, Math.max(onlyleft, onlyRight));
    }
    private int height(TreeNode node, int h){
        if(node == null){
            return h;
        }
        return Math.max(height(node.left, h+1), height(node.right, h+1));
    }
}
