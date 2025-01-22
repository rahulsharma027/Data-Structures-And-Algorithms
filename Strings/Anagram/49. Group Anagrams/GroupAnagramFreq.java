import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagramFreq {
    static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        int[] freq = new int[26];
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            Arrays.fill(freq, 0);
            for(char c : str.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++){
               if(freq[i] != 0){
                   sb.append((char)(i + 'a')).append(freq[i]);
               }
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
                map.get(key).add(str);
            }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    
}
