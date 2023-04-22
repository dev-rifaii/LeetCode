package leetcode.Easy;

import leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> values = new ArrayList<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                values.add(current.val);
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (current != null) {
                current = current.right;
            }
        }
        return values;
    }

    public static List<Integer> preorderTraversalRecursive(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> values = new ArrayList<>();
        values.add(root.val);

        if (root != null) {
            values.addAll(preorderTraversalRecursive(root.left));
            values.addAll(preorderTraversalRecursive(root.right));
        }

        return values;
    }
}