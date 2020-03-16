package tree.duplicatesubtree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateSubtrees {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        find(root, result, new HashMap<String, Integer>());
        return result;
    }

    private String find(TreeNode root, List<TreeNode> result, Map<String, Integer> countMap){
        if(root == null){
            return "#";
        }
        StringBuilder current = new StringBuilder();
        current.append(root.val)
                .append(",")
                .append(find(root.left, result, countMap))
                .append(",")
                .append(find(root.right, result, countMap));
        String currentString = current.toString();
        if(countMap.getOrDefault(currentString,0)==1){
            result.add(root);
        }
        countMap.put(currentString, countMap.getOrDefault(currentString, 0)+1);
        return currentString;
    }
}
