package leetCode;

public class LeetCode387 {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (char ch:s.toCharArray()) {
            chars[ch-'a'] = chars[ch-'a']+1;
        }
        for (int i=0;i<s.length();i++) {
            if(chars[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode387().firstUniqChar("loveleetcode"));
    }
}