package leetcode.Easy;

import leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/binary-tree-paths
public class BinaryTreePaths {

    final List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return Collections.emptyList();

        dfs(new ArrayList<>(), root);

        return result;
    }
    
    public void dfs(List<String> path, TreeNode target) {
        if (target == null) return;

        path.add(String.valueOf(target.val));

        if (target.left == null && target.right == null) {
            result.add(String.join("->", path));
        } else {
            dfs(path, target.left);
            dfs(path, target.right);
        }

        path.removeLast();
    }
}