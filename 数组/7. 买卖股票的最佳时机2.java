7. 买卖股票的最佳时机
https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1;i < prices.length;i++) {
            if (prices[i] > prices[i-1]) {
                result += (prices[i] - prices[i-1]);
            }
        }
        return result;
    }
}