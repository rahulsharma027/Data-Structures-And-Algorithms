class ReverseArray{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] revArr = new int[n];
        for(int i = 0; i < n; i++){
            revArr[i] = arr[n - i - 1];
        }
        for(int i = 0; i < n; i++){
            System.out.print(revArr[i] + " ");
        }
    }
}