package leetCode;

public class LeetCode867 {
    public int[][] transpose(int[][] A) {
        int rows = A.length,cols = A[0].length;
        if(rows == 0||cols == 0)
            return new int[0][0];
        int[][] B = new int[cols][rows];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}