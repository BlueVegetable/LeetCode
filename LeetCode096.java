package leetCode;

public class LeetCode096 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;dp[1] = 1;
        for (int i=2;i<=n;i++) {
            int count = 0;
            for (int j=1;j<=i;j++) {
                count += dp[j-1] * dp[i-j];
            }
            dp[i] = count;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode096().numTrees(3));
    }
}