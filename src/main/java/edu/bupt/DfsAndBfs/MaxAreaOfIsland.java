package edu.bupt.DfsAndBfs;

public class MaxAreaOfIsland {
    private int m;
    private int n;

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j) {
        int res = 0;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != 1) {
            return res;
        }
        grid[i][j] = 0;
        res++;
        res += dfs(grid, i - 1, j);
        res += dfs(grid, i + 1, j);
        res += dfs(grid, i, j - 1);
        res += dfs(grid, i, j + 1);
        return res;
    }
}
