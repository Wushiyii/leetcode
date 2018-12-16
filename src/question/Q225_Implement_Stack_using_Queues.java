package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q225_Implement_Stack_using_Queues {

    private Queue<Integer> data;
    private Queue<Integer> tmpData;

    /** Initialize your data structure here. */
    public Q225_Implement_Stack_using_Queues() {
        data = new LinkedList<>();
        tmpData = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        while (!data.isEmpty()) {
            tmpData.offer(data.poll());
        }
        data.offer(x);
        while (!tmpData.isEmpty()) {
            data.offer(tmpData.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return this.data.poll();
    }

    /** Get the top element. */
    public int top() {
        return this.data.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.data.isEmpty();
    }
}
