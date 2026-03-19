package edu.bupt.Tree;

public class KthSmallest {
    private int cnt;
    private int ans;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        dfs(root.left, k);
        cnt++;
        if (cnt == k) {
            ans = root.val;
        }
        dfs(root.right, k);
    }
}
