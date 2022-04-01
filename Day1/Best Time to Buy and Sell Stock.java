// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int diff = 0;
        for(int i=1; i<prices.length; i++)
        {
            min = Math.min(min, prices[i]);
            diff = Math.max(diff, prices[i] - min);
            
        }
        return diff;
    }
}
