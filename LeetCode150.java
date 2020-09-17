package leetCode;

import java.util.Stack;

public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        int result;
        Stack<String> stack = new Stack<>();
        for (String token:tokens) {
            switch (token) {
                case "+":solution(stack,token);break;
                case "-":solution(stack,token);break;
                case "*":solution(stack,token);break;
                case "/":solution(stack,token);break;
                default:stack.push(token);
            }
        }
        result = Integer.valueOf(stack.pop());
        return result;
    }
    private void solution(Stack<String> stack,String method) {
        int num1 = Integer.valueOf(stack.pop());
        int num2 = Integer.valueOf(stack.pop());
        int result = 0;
        switch (method) {
            case "+":result = num1+num2;break;
            case "-":result = num2-num1;break;
            case "*":result = num1*num2;break;
            case "/":result = num2/num1;break;
        }
        stack.push(String.valueOf(result));
    }

    public static void main(String[] args) {
        String[] tokens = new String[]{"4","13","5","/","+"};
        System.out.println(new LeetCode150().evalRPN(tokens));
    }
}