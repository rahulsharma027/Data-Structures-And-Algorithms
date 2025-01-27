class reverseOrder{
    static String reverseWords(String s){
        String[] arr = s.trim().split("\\s+");
        int l = 0;
        int r = arr.length-1;
        while (l < r) {
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return String.join(" ", arr);
    }
    public static void main(String[] args) {
        String str = " Hello World";
        System.out.println(reverseWords(str));
    }
}