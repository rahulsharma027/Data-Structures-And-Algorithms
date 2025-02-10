class cntBits{
    static int[] countBits(int n){
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                arr[i] = arr[i >> 1] + 1;
            }
            else{
                arr[i] = arr[i>>1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = countBits(n);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}}
