package leetCode;

public class LeetCode434 {
    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || !Character.isAlphabetic(s.charAt(i-1))) && Character.isAlphabetic(s.charAt(i))) {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}