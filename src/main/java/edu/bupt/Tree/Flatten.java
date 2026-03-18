package edu.bupt.Tree;

public class Flatten {
    private TreeNode cur;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.left = null;
        root.right = cur;
        cur = root;
    }
}
