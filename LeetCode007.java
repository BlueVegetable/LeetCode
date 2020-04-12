package leetCode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class LeetCode007 {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder("");
        if(x<0) {
            x = -x;
            stringBuilder.append("-");
        }
        while(x>0) {
            stringBuilder.append(x%10);
            x = x/10;
        }
        try {
            int result = Integer.parseInt(stringBuilder.toString());
            return result;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode007().reverse(-147483647));
    }
}