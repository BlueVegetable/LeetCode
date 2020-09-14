package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode823 {
    public int numFactoredBinaryTrees(int[] A) {
        final int MOD = 1_000_000_007;
        int length = A.length;
        Arrays.sort(A);
        long[] dp = new long[length];
        Arrays.fill(dp,1);

        Map<Integer,Integer> index = new HashMap<>();
        for (int i=0;i<A.length;i++)
            index.put(A[i],i);

        for (int i=0;i<length;i++) {
            for (int j=0;j<i;j++) {
                if(A[i]%A[j] == 0) {
                    int right = A[i]/A[j];
                    if(index.containsKey(right)) {
                        dp[i] = dp[i] + dp[j] * dp[index.get(right)] % MOD;
                    }
                }
            }
        }

        long result = 0;
        for (long x:dp) {
            result += x;
        }
        return (int) (result%MOD);
    }
}