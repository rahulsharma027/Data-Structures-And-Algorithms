import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagramSort{
    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) return result;
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str : strs){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String key = new String(charArray);
        if(map.containsKey(key)){
            map.get(key).add(str);
        }
        else{
            ArrayList<String> group = new ArrayList<String>();
            group.add(str);
            map.put(key, group);
        }
    }
    return new ArrayList<>(map.values());
}
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));

    }
}