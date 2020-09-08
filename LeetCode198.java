package leetCode;

public class LeetCode198 {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = nums[1];
        sum[2] = Math.max(sum[0]+nums[2],sum[1]);
        for (int i=3;i<nums.length;i++) {
            sum[i] = Math.max(sum[i-2]+nums[i],sum[i-1]+sum[i-3]);
        }
        return sum[nums.length-1];
    }

    public static void main(String[] args) {
        LeetCode198 leetCode198 = new LeetCode198();
        int[] nums = new int[]{1,2,3,1};
        System.out.println(leetCode198.rob(nums));
    }
}