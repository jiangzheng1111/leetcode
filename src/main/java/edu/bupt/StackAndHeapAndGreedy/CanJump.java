package edu.bupt.StackAndHeapAndGreedy;

public class CanJump {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (right < i) {
                return false;
            }
            right = Math.max(right, nums[i] + i);
        }
        return true;
    }
}
