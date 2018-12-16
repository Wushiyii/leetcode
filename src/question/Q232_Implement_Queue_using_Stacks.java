package question;

import java.util.Stack;

public class Q232_Implement_Queue_using_Stacks {

    private Stack<Integer> stack;
    private Stack<Integer> tmpStack;

    /** Initialize your data structure here. */
    public Q232_Implement_Queue_using_Stacks() {
        stack = new Stack<>();
        tmpStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        this.stack.push(x);
        while (!this.stack.isEmpty()) {
            this.tmpStack.push(this.stack.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (this.stack.size() > 1) {
            this.tmpStack.push(this.stack.pop());
        }
        int res = this.stack.pop();
        while (!this.tmpStack.isEmpty()) {
            this.stack.push(this.tmpStack.pop());
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        while (!this.stack.isEmpty()) {
            this.tmpStack.push(this.stack.pop());
        }
        int res = this.tmpStack.peek();
        while (!this.tmpStack.isEmpty()) {
            this.stack.push(this.tmpStack.pop());
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack.isEmpty();
    }

    public static void main(String[] args) {
        Q232_Implement_Queue_using_Stacks demo = new Q232_Implement_Queue_using_Stacks();
        demo.push(1);
        demo.push(2);
        System.out.println(demo.peek());
        System.out.println(demo.pop());
        System.out.println(demo.empty());

    }
}
