package leetcode.Easy;

import leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostorderTraversal {

    //TODO
    public static List<Integer> postorderTraversal(TreeNode root) {
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
                current = current.right;
            }

        }
        values.add(root.val);
        return values;
    }

    public static List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        if (root != null) {
            values.addAll(postorderTraversalRecursive(root.left));
            values.addAll(postorderTraversalRecursive(root.right));
            values.add(root.val);
        }

        return values;
    }

}
