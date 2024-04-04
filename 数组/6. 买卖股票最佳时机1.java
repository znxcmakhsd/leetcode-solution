6. 买卖股票最佳时机
https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0;i < prices.length;i++) {
            // 价钱最少时买入
            min = Math.min(min,prices[i]);
            // 记录最高价卖出
            result = Math.max(result,prices[i] - min);
        }
        return result;
    }
}