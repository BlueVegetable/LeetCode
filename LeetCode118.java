package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;
        for (int i=1;i<=numRows;i++) {
            int[] inline = new int[i];
            inline[0] = 1;
            for (int j=1;j<i-1;j++) {
                inline[j] = result.get(i-2).get(j-1) + result.get(i-2).get(j);
            }
            inline[i-1] = 1;
            List<Integer> line = new ArrayList<>();
            for (int num:inline) {
                line.add(num);
            }
            result.add(line);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode118().generate(4));
    }
}