package edu.bupt.ArraysAndMatrixAndString;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int dp = Integer.MIN_VALUE;
        int ans = 0;
        for (int num : nums) {
            dp = Math.max(dp, 0) + num;
            ans = Math.max(ans, dp);
        }
        return ans;
    }
}
