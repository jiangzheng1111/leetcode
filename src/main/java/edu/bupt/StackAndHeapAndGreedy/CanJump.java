package edu.bupt.StackAndHeapAndGreedy;

public class CanJump {

    public boolean canJump(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > pos) {
                return false;
            }
            pos = Math.max(pos, i + nums[i]);
        }
        return true;
    }
}
