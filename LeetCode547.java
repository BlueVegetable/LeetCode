package leetCode;

public class LeetCode547 {
    public int findCircleNum(int[][] M) {
        if(M == null||M.length == 0)
            return 0;
        int result = 0;
        for (int i=0;i<M.length;i++) {
            for (int j=0;j<M[0].length;j++) {
                if(solution(M,i,j) >= 1)
                    result++;
            }
        }
        return result;
    }
    private int solution(int[][] M,int rows,int cols) {
        if(rows<0 ||rows>=M.length||cols<0||cols>=M[0].length)
            return 0;
        if(M[rows][cols] == 0)
            return 0;
        if(M[rows][cols] == 2)
            return 0;
        M[rows][cols] = 2;
        return 1
                + solution(M,rows + 1,cols)
                + solution(M,rows - 1,cols)
                + solution(M,rows,cols + 1)
                + solution(M,rows,cols - 1);
    }
}