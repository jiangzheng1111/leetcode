package edu.bupt.HashAndTwoPoints;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if (set.contains(num - 1)) {
                continue;
            }
            int end = num + 1;
            while (set.contains(end)) {
                end++;
            }
            ans = Math.max(ans, end - num);
        }
        return ans;
    }
}
