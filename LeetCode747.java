package leetCode;

public class LeetCode747 {
    public int dominantIndex(int[] nums) {
        if(nums.length == 0)
            return -1;
        else if(nums.length == 1)
            return 0;
        int maxIndex = 0,secondMax = Integer.MIN_VALUE;
        for (int i=1;i<nums.length;i++) {
            if(nums[maxIndex]<nums[i]) {
                secondMax = nums[maxIndex];
                maxIndex = i;
            } else if(nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return nums[maxIndex] >= 2*secondMax?maxIndex:-1;
    }
}