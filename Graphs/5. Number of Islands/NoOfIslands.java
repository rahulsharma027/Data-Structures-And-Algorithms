import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class NoOfIslands{
    static void bfs(char[][] grid, int[][] visited, int[] delrow, int[] delcol, int ro, int co){
        visited[ro][co] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for(int i = 0; i < 4; i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                if(nrow >= 0 && nrow < grid.length && 
                   ncol >= 0 && ncol < grid[0].length &&
                   grid[nrow][ncol] == '1' && 
                   visited[nrow][ncol] == 0){
                    visited[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                   }
            }
        }
        
    }
    static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        int[][] visited = new int[n][m];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(grid[row][col] == '1' && visited[row][col] == 0){
                    count++;
                    bfs(grid, visited, delrow, delcol, row, col);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }
}