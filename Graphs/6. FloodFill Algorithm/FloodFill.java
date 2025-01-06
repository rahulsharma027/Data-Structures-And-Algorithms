class FloodFill{
    static void dfs(int[][] image, int[][] clone, int sr, int sc, 
    int[] delrow, int[] delcol, int inColor, int newColor){
    clone[sr][sc] = newColor;
    int n = image.length;
    int m = image[0].length;
    for(int i = 0; i < 4; i++){
        int nrow = sr + delrow[i];
        int ncol = sc + delcol[i];
        if(nrow >= 0 && nrow < n && ncol >=0 && ncol < m &&
           image[nrow][ncol] == inColor && 
           clone[nrow][ncol] != newColor){
            dfs(image, clone, nrow, ncol, delrow, delcol, inColor, newColor);
           }
    }
    }
    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int[][] clone = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                clone[i][j] = image[i][j];
            }
        }
        int inColor = image[sr][sc];
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        dfs(image, clone, sr, sc, delrow, delcol, inColor, color);
        return clone;
     }

    public static void main(String[] args) {
        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = floodFill(image, sr, sc, newColor);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}