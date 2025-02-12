class isPerfectSquare{
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long left = 2;
        long right = num/2;
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(mid * mid == num) return true;
            else if(mid * mid < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
