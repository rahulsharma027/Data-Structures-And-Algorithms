import java.util.Arrays;

class LongConSeq{
    static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int count = 1;
        int longest = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] - nums[i - 1] == 1) {
                    count++;
                } else {
                    longest = Math.max(longest, count);
                    count = 1;
                }
            }
        }
        return Math.max(longest, count);
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}