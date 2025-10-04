package edu.bupt.DfsAndBfs;

import edu.bupt.Tree.TreeNode;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        int rootVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if (rootVal > pVal && rootVal > qVal) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (rootVal < pVal && rootVal < qVal) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
