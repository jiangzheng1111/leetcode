package edu.bupt.StackAndHeapAndGreedy;

public class Jump {

    public int jump(int[] nums) {
        int n = nums.length;
        int curR = 0;
        int nextR = 0;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            nextR = Math.max(nextR, i + nums[i]);
            if (curR == i) {
                curR = nextR;
                ans++;
            }
        }
        return ans;
    }
}
