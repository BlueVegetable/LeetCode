package leetCode;

public class LeetCode309 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length<2) {
            return 0;
        }
        int[][] dp = new int[length][3];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        for(int i=1;i<dp.length;i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][2]-prices[i],dp[i-1][1]);
            dp[i][2] = dp[i-1][0];
        }
        return Math.max(dp[length-1][0],dp[length-1][2]);
    }
}