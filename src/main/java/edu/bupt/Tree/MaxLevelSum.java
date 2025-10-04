package edu.bupt.Tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxLevelSum {

    public int maxLevelSum(TreeNode root) {
        int ans = 0, maxSum = Integer.MIN_VALUE, level = 0;
        Deque<TreeNode> que = new ArrayDeque<>();
        que.offer(root);
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
            level++;
            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }
        }
        return ans;
    }
}
