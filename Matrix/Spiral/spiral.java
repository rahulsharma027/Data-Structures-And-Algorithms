import java.util.ArrayList;
import java.util.List;

class spiral{
    static  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length; 
        int top = 0, left = 0, right = m - 1, bottom = n - 1;
         while(top <= bottom && left <= right){
            //left -> right
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            //top -> down
           for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            //right -> left
            for(int i = right; i >= left; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left <= right){
            //bottom -> up 
            for(int i = bottom; i >= top; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}