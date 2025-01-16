class ValidPalindrome{
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] chararr = s.toCharArray();
        int l = 0;
        int h = chararr.length-1;
        while(l < h){
            if(chararr[l] != chararr[h]){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("race car"));
    }
}