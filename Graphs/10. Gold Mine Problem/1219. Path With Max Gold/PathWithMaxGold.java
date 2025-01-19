import java.util.Arrays;

public class PathWithMaxGold {
    static int dfs(int[][] matrix, int row, int col, int[][] memo){
        if(row < 0 || row >= matrix.length || col < 0 || 
          col >= matrix[0].length || matrix[row][col] == 0) return 0;
        int result = 0;
        int temp = matrix[row][col];
        matrix[row][col] = 0;
        result = Math.max(result, dfs(matrix, row + 1, col, memo));
        result = Math.max(result, dfs(matrix, row - 1, col, memo));
        result = Math.max(result, dfs(matrix, row , col + 1, memo));
        result = Math.max(result, dfs(matrix, row , col - 1, memo));
        matrix[row][col] = temp;
        return matrix[row][col] + result;
    }
    static int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] memo = new int[n][m];
        int ans = 0;
        for(int[] it : memo){
            Arrays.fill(it, -1);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans = Math.max(ans, dfs(grid, i, j, memo));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] goldMine = {{1,0,7,0,0 ,0},
                            {2,0,6,0,1 ,0},
                            {3,5,6,7,4 ,2},
                            {4,3,1,0,2 ,0},
                            {3,0,5,0,20,0}};
        System.out.println(getMaximumGold(goldMine));
    }
}
