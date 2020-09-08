package leetCode;

public class LeetCode053 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            int sum = 0;
            for (int j=i;j<nums.length;j++) {
                sum += nums[j];
                result = Math.max(sum,result);
            }
        }
        return result;
    }
}