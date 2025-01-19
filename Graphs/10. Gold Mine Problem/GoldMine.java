class GoldMine{
     //using recursion DFS 
     //O(3^(n*m)) Time and O(n*m) Space
     static int dfs(int[][] matrix, int row, int col, int[][] visited){
          if(row < 0 || row >= matrix.length || col < 0 || 
             col >= matrix[0].length || matrix[row][col] == 0){
              return 0;
          }
          int result = 0;
          visited[row][col] = 1;
          result = Math.max(result,  dfs(matrix, row-1, col+1, visited));
          result = Math.max(result,  dfs(matrix, row, col+1, visited));
          result = Math.max(result,  dfs(matrix, row+1, col+1, visited));
          return result + matrix[row][col];
     }
     
    static int maxGold(int[][] matrix){
     int n = matrix.length;
     int m = matrix[0].length;
     int[][] visited = new int[n][m];
     int ans = 0;
     for(int i=0; i<n; i++){
         if(visited[i][0] == 0){
                ans= Math.max(ans, dfs(matrix, i, 0, visited));
         }
     }
     return ans;
    }
   public static void main(String[] args) {
        int[][] goldMine = {
                            {1000, 2, 0},
                            {9   , 6, 8},
                            {99  , 8, 2}
                            };
        System.out.println(maxGold(goldMine));
   }
}