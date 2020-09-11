package leetCode;

public class LeetCode509 {
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        int[] numbers = new int[N+1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i=2;i<=N;i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[N];
    }
}