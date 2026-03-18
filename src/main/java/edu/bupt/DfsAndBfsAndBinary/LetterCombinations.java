package edu.bupt.DfsAndBfsAndBinary;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    private final static String[] MAPPING = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> ans = new ArrayList<>();
    private char[] path;
    private char[] d;
    private int n;

    public List<String> letterCombinations(String digits) {
        this.n = digits.length();
        this.d = digits.toCharArray();
        this.path = new char[n];
        if (n == 0) {
            return ans;
        }
        dfs(0);
        return ans;
    }

    private void dfs(int i) {
        if (i == n) {
            ans.add(new String(path));
            return;
        }
        for (char c : MAPPING[d[i] - '0'].toCharArray()) {
            path[i] = c;
            dfs(i + 1);
        }
    }
}
