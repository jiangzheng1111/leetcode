package edu.bupt.HashAndTwoPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int start = nums[i];
            if (start + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }
            if (start + nums[n - 2] + nums[n - 1] < 0) {
                continue;
            }
            if (i > 0 && start == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (start + nums[j] + nums[k] < 0) {
                    j++;
                } else if (start + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    ans.add(List.of(start, nums[j], nums[k]));
                    do {
                        j++;
                    } while (j < k && nums[j] == nums[j - 1]);
                    do {
                        k--;
                    } while (j < k && nums[k] == nums[k + 1]);
                }
            }
        }
        return ans;
    }
}
