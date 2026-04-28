package leetcode.Easy;

import java.util.ArrayDeque;
import java.util.Queue;

import leetcode.datastructures.TreeNode;

//https://leetcode.com/problems/same-tree
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            TreeNode fn = queue.poll();
            TreeNode sn = queue.poll();

            if (fn.left == null && sn.left != null) return false;
            if (fn.left != null && sn.left == null) return false;

            if (fn.right == null && sn.right != null) return false;
            if (fn.right != null && sn.right == null) return false;

            if (fn.left != null && fn.left.val != sn.left.val) return false;
            if (fn.right != null && fn.right.val != sn.right.val) return false;

            if (fn.left != null) {
                queue.offer(fn.left);
            }

            if (sn.left != null) {
                queue.offer(sn.left);
            }

            if (fn.right != null) {
                queue.offer(fn.right);
            }
            if (sn.right != null) {
                queue.offer(sn.right);
            }
        }

        return true;
    }
}
