package edu.bupt.DP;

public class CanPartition {

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        for (int num : nums) {
            for (int i = 0; i < target; i++) {
                dp[i] = dp[i] || dp[i - num];
            }
            if (dp[target]) {
                return true;
            }
        }
        return dp[target];
    }
}
