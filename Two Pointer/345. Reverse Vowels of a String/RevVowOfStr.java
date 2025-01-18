class RevVowOfStr{
    static String revVow(String str){
        char[] ch = str.toCharArray();
        String vow = "aeiouAEIOU";
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            //indexOf(ch[stat])==-1 means ch[start] is not a vowel
            //similarly for ch[end]
            //vow.contains(ch[start]+"") is also same as above
            //vow.contains(ch[end]+"") is also same as above
            if(!vow.contains(ch[start]+"")){
                start++;
            }
            else if(!vow.contains(ch[end]+"")){                 
                end--;
            }
            else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        System.out.println(revVow("Hello World"));
    }
}