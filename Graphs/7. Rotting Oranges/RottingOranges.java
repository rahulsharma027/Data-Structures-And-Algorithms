import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;
    int third;
    public Pair(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class RottingOranges{
    static int orangesRotting(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int freshcnt = 0;
        int cnt = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                }
                else{
                    visited[i][j] = 0;
                }
                if(grid[i][j] == 1){
                    freshcnt++;
                }
            }
        }
        int time = 0;
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int tm = q.peek().third;
            time = Math.max(time, tm);
            q.remove();
            for(int i = 0; i < 4; i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >=0 && nrow < n && ncol >=0 && ncol < m &&
                visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    visited[nrow][ncol] = 2;
                    q.add(new Pair(nrow, ncol, tm+1));
                    cnt++;
                }
            }

        }
        if(freshcnt != cnt){
            return -1;
        }
        return time;
        
    }
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
}