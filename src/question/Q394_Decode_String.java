package question;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q394_Decode_String {


    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        String res = "";
        String cur = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stack.push(s.charAt(i));
            } else {
                while (stack.peek() != '[') {
                    cur = stack.pop() + cur;
                }
                stack.pop();//去除"["
                String mul = "";
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    mul = stack.pop() + mul;
                }
                String temp = cur;
                if(!"".equals(mul)){
                    for (int j = 0; j < Integer.valueOf(mul) - 1; j++) {
                        cur = cur + temp;
                    }
                }
                for (int j = 0; j < cur.length(); j++) {
                    stack.push(cur.charAt(j));
                }
                cur = "";

            }
        }

        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Q394_Decode_String demo = new Q394_Decode_String();
        String s = demo.decodeString("10[leet]");
        System.out.println(s);
    }
}
