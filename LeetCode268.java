package leetCode;

import java.util.Arrays;

public class LeetCode268 {
    public int missingNumber(int[] nums) {
        boolean[] values = new boolean[nums.length+1];
        Arrays.fill(values,false);
        for (int num:nums) {
            values[num] = true;
        }
        int result = -1;
        for (int i=0;i<values.length;i++) {
            if(values[i] == false)
                result = i;
        }
        return result;
    }
}