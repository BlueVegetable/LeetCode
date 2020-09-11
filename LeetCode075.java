package leetCode;

public class LeetCode075 {
    public void sortColors(int[] nums) {
        int length = nums.length;
        if(length == 0||length == 1)
            return ;
        if(length == 2) {
            if(nums[1]<nums[0])
                swap(nums,0,1);
            return ;
        }
        if(length == 3) {
            if(nums[0]>nums[1]) {
                swap(nums,0,1);
            }
            if(nums[1]>nums[2]) {
                swap(nums,1,2);
            }
            return ;
        }
        int p0 = 0,p2 = length-1,current = 0;
        while(current < p2) {
            if(nums[current] == 0) {
                ;
            }
        }
    }
    private void swap(int[] nums,int index1,int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}