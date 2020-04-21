package tree.bstfrompreorder;

import tree.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length-1);
    }

    private TreeNode helper(int[] preorder, int start, int end){
        if(start>end){
            return null;
        }
        TreeNode node = new TreeNode(preorder[start]);
        int partition = start+1;
        while(partition<=end && preorder[partition]<preorder[start]){
            partition++;
        }


        node.left = helper(preorder,start+1,partition-1);
        node.right = helper(preorder, partition, end);
        return node;
    }

}
