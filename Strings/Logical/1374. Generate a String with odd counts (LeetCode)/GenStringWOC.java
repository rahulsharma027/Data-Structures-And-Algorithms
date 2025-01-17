class GenStringWOC{
    static String generate(int n){
        StringBuilder str = new StringBuilder();
        if(n % 2 != 0){
            str.append("a".repeat(n));
        }
        else{
            str.append("g".repeat(n-1));
            str.append("b");
        }   
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(generate(8));
    }
}