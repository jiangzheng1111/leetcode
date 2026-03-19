package edu.bupt.Tree;

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }

    private TreeNode dfs(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = dfs(root.left);
        TreeNode r = dfs(root.right);
        root.left = r;
        root.right = l;
        return root;
    }
}
