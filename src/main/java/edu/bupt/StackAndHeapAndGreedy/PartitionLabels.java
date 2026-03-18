package edu.bupt.StackAndHeapAndGreedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        char[] sc = s.toCharArray();
        int[] last = new int[26];
        int l = 0;
        int r = 0;
        for (int i = 0; i < sc.length; i++) {
            last[sc[i] - 'a'] = i;
        }
        for (int i = 0; i < sc.length; i++) {
            r = Math.max(r, last[sc[i] - 'a']);
            if (r == i) {
                ans.add(r - l + 1);
                l = r + 1;
            }
        }
        return ans;
    }
}
