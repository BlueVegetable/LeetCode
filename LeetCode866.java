package leetCode;

public class LeetCode866 {
    private boolean isPrime(int num) {
        if(num<=5) {
            return num == 2||num==3||num==5;
        }
        for (int i=2;i<=Math.sqrt(num);i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
    private int getNumber(int num) {
        String s = num + "";
        char[] chs = s.toCharArray();
        int middle = chs.length/2;
        while(true) {
            for (int i=0;i<middle;i++) {
                chs[chs.length-1-i] = chs[i];
            }
            int temp = Integer.valueOf(String.valueOf(chs));
            if(temp>=num) return temp;
            int j=chs.length%2 == 1?middle:middle-1;
            while(chs[j] == '9')
                chs[j--] = '0';
            chs[j]++;
        }
    }
    public int primePalindrome(int N) {
        while(true) {
            N = getNumber(N);
            if(isPrime(N))
                return N;
            N++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode866().primePalindrome(9));
    }
}