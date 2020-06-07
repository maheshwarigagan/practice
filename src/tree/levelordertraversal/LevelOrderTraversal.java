package tree.levelordertraversal;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

     public List<List<Integer>> levelOrderIterative(TreeNode root) {

         List<List<Integer>> levels = new ArrayList<>();
         if (root == null)
             return levels;

         Queue<TreeNode> queue  = new LinkedList<>();
         queue.add(root);

         while(!queue.isEmpty()){
             levels.add(new ArrayList<>());
             int elements_at_current_level = queue.size();
             for(int i=0;i<elements_at_current_level;i++){
                 TreeNode current = queue.poll();
                 levels.get(levels.size()-1).add(current.val);
                 if(current.left != null){
                     queue.add(current.left);
                 }
                 if(current.right != null){
                     queue.add(current.right);
                 }


             }
         }

         return levels;

     }


}
