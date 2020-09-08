package leetCode;

public class LeetCode567 {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        int[] ch_count1 = new int[26], ch_count2 = new int[26];
        for (int i = 0; i < len1; ++i) {
            ++ch_count1[s1.charAt(i) - 'a'];
            ++ch_count2[s2.charAt(i) - 'a'];
        }
        for (int i = len1; i < len2; ++i) {
            if (isEqual(ch_count1, ch_count2)) return true;
            --ch_count2[s2.charAt(i - len1) - 'a'];
            ++ch_count2[s2.charAt(i) - 'a'];
        }
        return isEqual(ch_count1, ch_count2);
    }

    private boolean isEqual(int[] ch_count1, int[] ch_count2) {
        for (int i = 0; i < 26; ++i)
            if (ch_count1[i] != ch_count2[i])
                return false;
        return true;
    }
}