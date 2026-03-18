package edu.bupt.DfsAndBfsAndBinary;

import edu.bupt.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeepestLeaveSum {

    public int deepestLeaveSum(TreeNode root) {
        Deque<TreeNode> que = new ArrayDeque<>();
        que.offer(root);
        int ans = 0;
        while (!que.isEmpty()) {
            int n = que.size();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = que.poll();
                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }
                sum += node.val;
            }
            ans = sum;
        }
        return ans;
    }
}
