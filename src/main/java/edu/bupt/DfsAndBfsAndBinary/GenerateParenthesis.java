package edu.bupt.DfsAndBfsAndBinary;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    private List<String> ans = new ArrayList<>();
    private char[] path;
    private int n;

    public List<String> generateParenthesis(int n) {
        this.path = new char[n * 2];
        this.n = n;
        dfs(0, 0);
        return ans;
    }

    private void dfs(int i, int left) {
        if (i == n * 2) {
            ans.add(new String(path));
            return;
        }
        if (left < n) {
            path[i] = '(';
            dfs(i + 1, left + 1);
        }
        if (i - left < left) {
            path[i] = ')';
            dfs(i + 1, left);
        }
    }
}
