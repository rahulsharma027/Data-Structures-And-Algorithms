class contain{
    public static void main(String[] args) {
        String str = "Rahul";
        String[] words = {"ah", "lh", "cd", "u"};
        int count = 0;
        for(int i = 0; i < words.length; i++)
        {
            if(str.contains(words[i])) count++;
        }
        System.out.println(count);
    }
}