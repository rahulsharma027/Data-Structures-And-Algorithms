class MovingZeroes{
    static int[] moveZeroes(int[] arr){
        int left = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        return arr;
    }
   public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        arr = moveZeroes(arr);
        for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
        }
   } 
}