package edu.bupt.DfsAndBfsAndBinary;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    private boolean[] flag;

    public List<List<Integer>> permute(int[] nums) {
        this.flag = new boolean[nums.length];
        dfs(nums, 0);
        return ans;
    }

    private void dfs(int[] nums, int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!flag[j]) {
                flag[j] = true;
                path.add(nums[j]);
                dfs(nums, i + 1);
                path.removeLast();
                flag[j] = false;
            }
        }
    }
}
