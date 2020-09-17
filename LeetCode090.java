package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        solution(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void solution(int[] nums,int start,List<Integer> temp,List<List<Integer>> result) {
        result.add(new ArrayList<>(temp));
        for (int i=start;i<nums.length;i++) {
            if(i>start&&nums[i] == nums[i-1])
                continue;
            temp.add(nums[i]);
            solution(nums,i+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}