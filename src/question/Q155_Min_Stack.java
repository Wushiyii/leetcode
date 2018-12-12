package question;

import java.util.Stack;

public class Q155_Min_Stack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public Q155_Min_Stack() {
        dataStack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        int y=dataStack.pop();
        if(minStack.peek()==y){
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
