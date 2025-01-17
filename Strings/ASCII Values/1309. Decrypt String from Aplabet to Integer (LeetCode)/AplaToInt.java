class AplaToInt{
    static String alphaToInt(String s){
        int p = s.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int i = p; i >= 0; i--){
            int num;
            if(s.charAt(i) == '#'){
                num = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                i-=2; 
            }
            else{
                num = s.charAt(i) - '0';
            }
            sb.append((char) (num + 96));
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "10#20#12";
        System.out.println(alphaToInt(s));
    }
}