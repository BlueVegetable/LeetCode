package leetCode;

/**
 * 买卖股票的最佳时机
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 */
public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int result = 0;
        if(prices.length == 0)
            return 0;
        int[] dp = new int[prices.length];
        dp[0] = Integer.MAX_VALUE;
        for (int i=1;i<dp.length;i++) {
            if(prices[i-1] < dp[i-1])
                dp[i] = prices[i-1];
            else
                dp[i] = dp[i-1];
        }
        for(int i=1;i<dp.length;i++) {
            result = Math.max(result,prices[i]-dp[i]);
        }
        return result;
    }
}