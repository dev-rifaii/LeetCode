package Easy;

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
