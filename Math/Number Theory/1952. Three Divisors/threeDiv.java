class threeDiv{
    static boolean isThree(int n) {
        int count = 1;
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                count++;
            }
            if(count == 4) break;
        }
        if(count == 3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isThree(n));
    }
}