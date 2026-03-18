package edu.bupt.DfsAndBfsAndBinary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0);
        return ans;
    }

    private void dfs(int[] candidates, int leave, int i) {
        if (leave < 0) {
            return;
        }
        if (leave == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            path.add(candidates[j]);
            dfs(candidates, leave - candidates[j], j);
            path.removeLast();
        }
    }
}
