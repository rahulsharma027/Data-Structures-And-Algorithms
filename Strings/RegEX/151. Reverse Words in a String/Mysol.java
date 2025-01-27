import java.util.ArrayList;
import java.util.List;

public class Mysol {
    static String reverseWords(String s) {
        s = s.trim();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else if (sb.length() > 0){
                list.add(sb.reverse().toString());
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            list.add(sb.reverse().toString());
        }
         return String.join(" ", list);
    }
    public static void main(String[] args) {
        String str = " Hello World";
        System.out.println(reverseWords(str));
    }
}
