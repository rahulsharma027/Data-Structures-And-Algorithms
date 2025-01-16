class NoOfSeg{
    public int countSegments(String s) {
        String[] words = s.split(" ");
        int count = 0;
        for(String word : words){
            if(!word.isEmpty()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NoOfSeg obj = new NoOfSeg();
        System.out.println(obj.countSegments("Hello, my name is John"));
    }
}