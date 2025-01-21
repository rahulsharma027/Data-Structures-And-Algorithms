class IsSub{
    static boolean isSub(String s, String t) {
        int p1 = 0, p2 = 0;
        int l1 = s.length();
        int l2 = t.length();
        while(p1 < l1 && p2 < l2){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                p2++;
            }
        }
        return p1 == l1;
    }
    public static void main(String[] args) {
        String s1 = "axc";
        String s2 = "abcde";
        System.out.println(isSub(s1, s2));
    }
}