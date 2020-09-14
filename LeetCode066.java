package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode066 {
    public int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] == 0) {
            digits[0] = 1;
            return digits;
        }
        Stack<Integer> mid = new Stack<>();
        List<Integer> result = new ArrayList<>();
        for (int digit:digits) {
            mid.push(digit);
        }
        int add = 1;
        while(!mid.isEmpty()) {
            int num = mid.pop();
            num = num + add;
            if(add == 1) {
                add = 0;
            }
            if(num>=10) {
                num = num%10;
                add = 1;
            }
            result.add(num);
        }
        if(add == 1)
            result.add(add);
        int[] arrayResult = new int[result.size()];
        for (int i=result.size()-1;i>=0;i--) {
            arrayResult[result.size()-i-1] = result.get(i);
        }
        return arrayResult;
    }

    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 9;
        array[1] = 9;
        array[2] = 9;
        array = new LeetCode066().plusOne(array);
        System.out.println(array);
    }
}