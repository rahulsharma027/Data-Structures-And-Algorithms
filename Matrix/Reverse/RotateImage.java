public class RotateImage {
    static int[][] rotate(int[][] arr){
        int n = arr.length;
        //transpose
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1]; 
                arr[i][n - j - 1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = rotate(arr);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res.length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
}
}