package edu.bupt.Tree;

public class IsValidBST {
    private TreeNode pre;

    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean l = dfs(root.left);
        if (pre != null && pre.val >= root.val) {
            return false;
        }
        pre = root;
        boolean r = dfs(root.right);
        return l && r;
    }
}
