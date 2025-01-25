import java.util.HashMap;
import java.util.Map;

class SingleNum{
     static void increment (Map<Integer, Integer> map, int key){
        Integer count = map.get(key) + 1;
        map.put(key, count);
    }
    static int findOcc(Map<Integer, Integer> map){
        int ans = 0;
        for(int key : map.keySet()) {
            if(map.get(key).equals(1)) {
            ans = key;
            }
        }    
        return ans;
    }
    static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x, 1);
            }
            else{
                increment(map, x);
            }
        }
        int res = findOcc(map);
        return res;
    }
    public static void main(String[] args) {
        int[] array = {2,2,1, 33};
        System.out.println(singleNumber(array));
    }
}