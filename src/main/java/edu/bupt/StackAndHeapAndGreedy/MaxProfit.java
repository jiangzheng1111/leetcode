package edu.bupt.StackAndHeapAndGreedy;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int ans = 0;
        int preMin = Integer.MAX_VALUE;
        for (int price : prices) {
            preMin = Math.min(preMin, price);
            ans = Math.max(ans, price - preMin);
        }
        return ans;
    }
}
