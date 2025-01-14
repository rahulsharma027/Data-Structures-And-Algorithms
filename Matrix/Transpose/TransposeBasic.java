class TransposeBasic{
    static int[][] tranposeMatrix(int[][] arr){
        int n = arr.length;
        int[][] transpose = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                transpose[i][j] = arr[j][i];
                }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        int[][] transpose = tranposeMatrix(arr);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}