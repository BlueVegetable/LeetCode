package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode508 {
    Map<Integer,Integer> mid;
    int maxTimes;
    public int[] findFrequentTreeSum(TreeNode root) {
        mid = new HashMap<>();
        maxTimes = Integer.MIN_VALUE;
        sum(root);
        List<Integer> nums = new ArrayList<>();
        for (Map.Entry<Integer,Integer> inline:mid.entrySet()) {
            if(inline.getValue() == maxTimes) {
                nums.add(inline.getKey());
            }
        }
        int[] result = new int[nums.size()];
        for (int i=0;i<nums.size();i++) {
            result[i] = nums.get(i);
        }
        return result;
    }
    private int sum(TreeNode root) {
        if(root == null)
            return 0;
        int sum = root.val + sum(root.left) + sum(root.right);
        int num = mid.getOrDefault(sum,0);
        num = num + 1;
        maxTimes = Math.max(maxTimes,num);
        mid.put(sum,num);
        return sum;
    }
}