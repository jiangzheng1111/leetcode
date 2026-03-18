package edu.bupt.DfsAndBfsAndBinary;

import java.util.ArrayList;
import java.util.List;

public class Partition {
    private List<List<String>> ans = new ArrayList<>();
    private List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return ans;
    }

    private void dfs(String s, int i) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (reverse(s, i, j)) {
                path.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                path.removeLast();
            }
        }
    }

    private boolean reverse(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
