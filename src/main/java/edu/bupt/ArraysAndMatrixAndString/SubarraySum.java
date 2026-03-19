package edu.bupt.ArraysAndMatrixAndString;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : preSum) {
            ans += map.getOrDefault(num - k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
