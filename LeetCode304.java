package leetCode;

public class LeetCode304 {

    private int[][] matrix;
    private int[][] dp;

    public LeetCode304(int[][] matrix) {
        this.matrix = matrix;
        if (matrix != null && matrix.length != 0) {
            dp = new int[matrix.length+1][matrix[0].length+1];
            initDp(matrix,dp);
        }
    }

    private void initDp(int[][] matrix,int[][] dp) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                dp[i+1][j+1] = dp[i][j+1] + dp[i+1][j] - dp[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1] - dp[row2-row1][col2+1] - dp[row2+1][col2-col1] + dp[row2-row1][col2-col1];
    }
}