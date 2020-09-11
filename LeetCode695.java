package leetCode;

public class LeetCode695 {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null||grid.length == 0||grid[0].length == 0)
            return 0;
        int result = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    int area = area(grid,j,i);
                    result = Math.max(result,area);
                }
            }
        }
        return result;
    }
    private int area(int[][] grid,int col,int row) {
        if(col<0||col>=grid[0].length||row<0||row>=grid.length)
            return 0;
        if(grid[row][col]!=1)
            return 0;
        grid[row][col]=2;
        return 1 + area(grid,col,row-1)
                + area(grid,col,row+1)
                + area(grid,col-1,row)
                + area(grid,col+1,row);
    }
}