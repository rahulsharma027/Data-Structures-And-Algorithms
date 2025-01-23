import java.util.HashSet;

class ContainsDup{
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.contains(x)){
                set.add(x);
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,5,6,7,8,9,10};
        System.out.println(containsDuplicate(nums));
    }
}