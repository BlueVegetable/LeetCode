package leetCode;

public class LeetCode704 {
    public int search(int[] nums, int target) {
        int start = 0,end = nums.length-1;
        while(start<=end) {
            int middle = (end + start)/2;
            if(nums[middle] == target)
                return middle;
            else if(nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}