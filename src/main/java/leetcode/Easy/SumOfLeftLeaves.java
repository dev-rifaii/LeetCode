package leetcode.Easy;

import leetcode.datastructures.TreeNode;

//https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;

        if (root.left != null) {
            sum += sumOfLeftLeaves(root.left);
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
        }
        if (root.right != null) {
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }
}
