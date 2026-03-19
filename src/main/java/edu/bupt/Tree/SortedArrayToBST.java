package edu.bupt.Tree;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = (l + r) >>> 1;
        TreeNode root = new TreeNode(nums[m]);
        root.left = dfs(nums, l, m - 1);
        root.right = dfs(nums, m + 1, r);
        return root;
    }
}
