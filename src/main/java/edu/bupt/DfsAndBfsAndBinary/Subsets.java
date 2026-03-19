package edu.bupt.DfsAndBfsAndBinary;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return ans;
    }

    private void dfs(int[] nums, int i) {
        ans.add(new ArrayList<>(path));
        for (int j = i; j < nums.length; j++) {
            path.add(nums[j]);
            dfs(nums, j + 1);
            path.removeLast();
        }
    }
}
