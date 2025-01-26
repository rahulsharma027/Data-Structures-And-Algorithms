import java.util.Arrays;

class MinFiffK{
    static public int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;
        Arrays.sort(nums);
        int l = 0, r = k - 1;
        int res = Integer.MAX_VALUE;
        while(r < nums.length){
            res = Math.min(res, nums[r] - nums[l]);
            l++;
            r++;
        } 
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {9, 1, 4, 7};
        int k = 3;
        System.out.println(minimumDifference(nums, k)); 
    }
}