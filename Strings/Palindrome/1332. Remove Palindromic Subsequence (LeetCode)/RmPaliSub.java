class RmPaliSub{ 
    // we only have a's and b's in the string so the 
    // output can either be 1 or 2 (that's the trick to solve this problem)
    static boolean check(String s){
    int l = 0;
    int h = s.length() - 1;
    while(l < h){
        if(s.charAt(l) != s.charAt(h)){
            return false;
        }
        l++;
        h--;
    }
    return true;
}
   static int removePalindromeSub(String s) {
    if(check(s)){
        return 1;
    }
    return 2;
    }
    public static void main(String[] args) {
    System.out.println(removePalindromeSub("bababa"));
    }
}