public class SingleNumBit {
    static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i]; 
        }
        return ans;    
    }
    public static void main(String[] args) {
        int[] array = {2,2,4,310};
        System.out.println(singleNumber(array));
    }
}
