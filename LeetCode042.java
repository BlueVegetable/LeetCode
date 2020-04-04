package leetCode;

/**
 * 给定n个非负整数表示每个宽度为1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class LeetCode042 {
    public int trap(int[] height) {
        int length = height.length;
        if(length == 0||length == 1) {
            return 0;
        }
        int left = 0,right = length-1,result = 0;
        while(left<right&&height[left+1] >= height[left]) {
            left++;
        }
        while(left<right&&height[right-1]>=height[right]) {
            right--;
        }
        while(left<right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            if(leftHeight <= rightHeight) {
                while(left<right) {
                    left++;
                    if(height[left] < leftHeight) {
                        result += leftHeight - height[left];
                    } else {
                        break;
                    }
                }
            } else {
                while(left<right) {
                    right--;
                    if(height[right] < rightHeight) {
                        result += rightHeight - height[right];
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }
}