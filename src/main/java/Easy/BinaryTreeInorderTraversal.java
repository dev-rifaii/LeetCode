package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {


    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null || root.val == 0) return Collections.emptyList();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> values = new ArrayList<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (current != null) {
                values.add(current.val);
                current = current.right;
            }
        }

        return values;
    }

    public static List<Integer> inorderTraversalRecursive(TreeNode root) {
        if (root == null) return Collections.emptyList();
        TreeNode head = root;
        List<Integer> values = new ArrayList<>();
        if (root != null) {
            values.addAll(inorderTraversalRecursive(root.left));
            if (root.equals(head)) values.add(root.val);
            values.addAll(inorderTraversalRecursive(root.right));
        }
        return values;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
