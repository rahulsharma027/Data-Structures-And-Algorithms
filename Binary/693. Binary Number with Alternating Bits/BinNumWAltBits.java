class BinNumWAltBits{
    static boolean altBits(int n){
        String bin = Integer.toBinaryString(n);
        for(int i = 0; i < bin.length() - 1; i++){
            if(bin.charAt(i) == bin.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(altBits(n));
    }
}