import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortByFreq{
    static String sortByFreq(String s){
        int[] freq = new int[125];
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        List<Character> list = new ArrayList<>();
        for(int i = 48; i < 125; i++){
            if(freq[i] > 0){
                list.add((char)i);
            }
        }
        Collections.sort(list, (a, b) -> freq[b] - freq[a]);
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            for(int i = 0; i < freq[c]; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "treez";
        System.out.println(sortByFreq(str));
    }
}