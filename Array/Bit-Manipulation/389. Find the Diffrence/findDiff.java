class findDiff{
    static char findTheDifference(String s, String t) {
        int scount = 0;
        int tcount = 0;
        for(char ch : s.toCharArray()){
            scount = (int) ch;
        }
        for(char ch : t.toCharArray()){
            tcount += (int) ch;
        }
        char odd = (char)(tcount - scount);
        return odd;
    }
    public static void main(String[] args) {
        char c = findTheDifference("abc", "abcd");
        System.out.println(c);

    }
}