package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        result.add("");
        for (char ch:S.toCharArray()) {
            if(Character.isDigit(ch)) {
                for (int i=0;i<result.size();i++) {
                    result.set(i,result.get(i) + ch);
                }
            }
            if(Character.isUpperCase(ch)) {
                List<String> another = new ArrayList<>(result);
                for (int i=0;i<result.size();i++) {
                    result.set(i,result.get(i) + ch);
                }
                for (int i=0;i<another.size();i++) {
                    another.set(i,another.get(i) + Character.toLowerCase(ch));
                }
                result.addAll(another);
            } else if(Character.isLowerCase(ch)) {
                List<String> another = new ArrayList<>(result);
                for (int i=0;i<result.size();i++) {
                    result.set(i,result.get(i) + ch);
                }
                for (int i=0;i<another.size();i++) {
                    another.set(i,another.get(i) + Character.toUpperCase(ch));
                }
                result.addAll(another);
            }
        }
        return result;
    }
}