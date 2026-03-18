package edu.bupt.StackAndHeapAndGreedy;

import java.util.*;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Integer m = Collections.max(map.values());
        List<Integer>[] buckets = new List[m + 1];
        Arrays.setAll(buckets, x -> new ArrayList<Integer>());
        for (Map.Entry<Integer, Integer> kv : map.entrySet()) {
            Integer key = kv.getKey();
            Integer value = kv.getValue();
            buckets[value].add(key);
        }
        int j = 0;
        for (int i = m; i >= 0 && j < k; i--) {
            for (Integer num : buckets[i]) {
                ans[j++] = num;
            }
        }
        return ans;
    }
}
