package question;

import java.util.Stack;

public class Q150_Evaluate_Reverse_Polish_Notation {


    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (tokens[i])
                {
                    case "+":
                        int c = b + a;
                        stack.push(String.valueOf(c));
                        break;
                    case "-":
                        c = b - a;
                        stack.push(String.valueOf(c));
                        break;
                    case "*":
                        c = b * a;
                        stack.push(String.valueOf(c));
                        break;
                    case "/":
                        c = b / a;
                        stack.push(String.valueOf(c));
                        break;


                }
            }else {
                stack.push(tokens[i]);
            }

        }
        return Integer.parseInt(stack.peek());
    }

}
