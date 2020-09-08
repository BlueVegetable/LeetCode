package leetCode;

public class LeetCode067 {
    public String addBinary(String a, String b) {
        a = reverse(a);
        b = reverse(b);
        boolean bit = false;
        int length = Math.min(a.length(),b.length());
        String result = "";
        int i=0;
        for (;i<length;i++) {
            int value = a.charAt(i) + b.charAt(i) - '0' - '0';
            if(bit)
                value++;
            if(value>1) {
                value = value-2;
                bit = true;
            } else {
                bit = false;
            }
            result = result + value;
        }
        System.out.println("1");
        while(i<a.length()) {
            int value = a.charAt(i) - '0';
            if(bit) {
                value++;
            }
            if(value>1) {
                value = value-2;
                bit = true;
            } else {
                bit = false;
            }
            result = result + value;
            i++;
        }
        while(i<b.length()) {
            int value = b.charAt(i) - '0';
            if(bit) {
                value++;
            }
            if(value>1) {
                value = value-2;
                bit = true;
            } else {
                bit = false;
            }
            result = result + value;
            i++;
        }
        if(bit)
            result = result + "1";
        return reverse(result);
    }
    private static String reverse(String origin) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<origin.length();i++) {
            stringBuilder.append(origin.charAt(i));
        }
        stringBuilder = stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LeetCode067 leetCode067 = new LeetCode067();
        System.out.println(leetCode067.addBinary("1010","1011"));
    }
}