package edu.bupt.DfsAndBfsAndBinary;

public class Exist {
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private char[][] b;
    private char[] w;
    private int m;
    private int n;

    public boolean exist(char[][] board, String word) {
        this.b = board;
        this.w = word.toCharArray();
        this.m = board.length;
        this.n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int k) {
        if (k == w.length) {
            return true;
        }
        if (w[k] != b[i][j]) {
            return false;
        }
        b[i][j] = '0';
        for (int[] dir : DIRS) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && y >= 0 && x < m && y < n && dfs(x, y, k + 1)) {
                return true;
            }
        }
        b[i][j] = w[k];
        return false;
    }
}
