package edu.bupt.DP;

public class MaxProduct {

    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int tempMax = curMax;
            int tempMin = curMin;
            curMax = Math.max(Math.max(cur * tempMax, cur * tempMin), cur);
            curMin = Math.min(Math.min(cur * tempMax, cur * tempMin), cur);
            ans = Math.max(ans, curMax);
        }
        return ans;
    }
}
