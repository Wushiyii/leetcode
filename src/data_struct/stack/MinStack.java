package data_struct.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
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

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(0);
        obj.push(1);
        obj.push(0);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());

    }
}
