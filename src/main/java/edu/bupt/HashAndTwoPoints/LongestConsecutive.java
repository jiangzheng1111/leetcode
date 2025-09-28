package edu.bupt.HashAndTwoPoints;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (Integer start : set) {
            if (set.contains(start - 1)) {
                continue;
            }
            int end = start + 1;
            while (set.contains(end)) {
                end++;
            }
            ans = Math.max(ans, end - start);
        }
        return ans;
    }
}
