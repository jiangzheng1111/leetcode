package edu.bupt.ArraysAndMatrixAndString;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && nums[queue.getLast()] <= nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
            if (i - queue.getFirst() >= k) {
                queue.removeFirst();
            }
            if (i - k + 1 >= 0) {
                ans[i - k + 1] = nums[queue.getFirst()];
            }
        }
        return ans;
    }
}
