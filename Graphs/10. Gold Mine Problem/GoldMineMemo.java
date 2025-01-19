import java.util.Arrays;

public class GoldMineMemo {
    //using memoization
    //O(n*m) Time and O(n*m) Space
    static int dfs(int[][] matrix, int row, int col, int[][] memo){
        if(row < 0 || row >= matrix.length  || col >= matrix[0].length){
            return 0;
        }
        if(memo[row][col] != -1){
            return memo[row][col];
        }
        int result = 0;
        result = Math.max(result,  dfs(matrix, row-1, col+1, memo));
        result = Math.max(result,  dfs(matrix, row, col+1, memo));
        result = Math.max(result,  dfs(matrix, row+1, col+1, memo));
        return memo[row][col] = result + matrix[row][col];
    }
    static int maxGold(int[][] matrix){
        int n = matrix.length;
        int[][] memo = new int[n][matrix[0].length];
        int ans = 0;
        for(int[] row: memo){
            Arrays.fill(row, -1);
            }
        for(int i=0; i<n; i++){
            ans = Math.max(ans, dfs(matrix, i, 0, memo));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] goldMine = {
                            {11, 2, 0},
                            {19, 6, 8},
                            {12, 8, 2}
                            };
        System.out.println(maxGold(goldMine));
    }
    
}
