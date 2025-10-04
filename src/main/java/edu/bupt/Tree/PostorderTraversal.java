package edu.bupt.Tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        dfs(root.right);
        ans.add(root.val);
    }
}
