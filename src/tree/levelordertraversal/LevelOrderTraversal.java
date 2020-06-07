package tree.levelordertraversal;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    List<List<Integer>> output;
    // recursive
    public List<List<Integer>> levelOrder(TreeNode root) {
        output = new ArrayList<>();
        if (root == null)
            return output;
        helper(root, 0);
        return output;
    }
    private void helper(TreeNode node, int level){
        if(output.size() == level){
            output.add(new ArrayList<>());
        }
        output.get(level).add(node.val);

        if(node.left != null){
            helper(node.left, level+1);
        }
        if(node.right != null){
            helper(node.right, level+1);
        }
    }

}
