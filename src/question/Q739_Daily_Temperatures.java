package question;

import java.util.Stack;

public class Q739_Daily_Temperatures {


    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            res[i] = 0;
        }
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int cur = stack.pop();
                res[cur] = i - cur;
            }
            stack.push(i);
        }
        return res;

    }




    public static void main(String[] args) {
        int[] T = new int[]{73,74,75,71,69,72,76,73};
        Q739_Daily_Temperatures demo = new Q739_Daily_Temperatures();
        int[] ints = demo.dailyTemperatures(T);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
