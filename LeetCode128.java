package leetCode;

import java.util.HashMap;

/**
 * 最长连续序列
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 要求算法的时间复杂度为 O(n)。
 */
public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> util = new HashMap<>();
        int result = 0;
        for (int num:nums) {
            util.put(num,false);
        }
        for (int num:nums) {
            if(util.get(num))
                continue;
            int right = num+1;
            int left = num-1;
            while(util.containsKey(right) && util.get(right) == false) {
                util.put(right,true);
                right++;
            }
            while(util.containsKey(left) && util.get(left) == false) {
                util.put(left,true);
                left--;
            }
            result = Math.max(result,right-left-1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode128().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}