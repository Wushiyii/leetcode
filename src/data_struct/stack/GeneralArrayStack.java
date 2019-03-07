package data_struct.stack;

import java.lang.reflect.Array;

public class GeneralArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private T[] data;
    private int count;

    public GeneralArrayStack(Class<T> type) {
        this(type, DEFAULT_CAPACITY);
    }

    public GeneralArrayStack(Class<T> type, int size) {
        this.data = (T[]) Array.newInstance(type, size);
        this.count = 0;
    }

    public void push(T t) {
        data[count++] = t;
    }

    public T peek() {
        return data[count - 1];
    }

    public T pop() {
        T t = data[count - 1];
        data[count - 1] = null;
        count--;
        return t;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // 打印“栈”
    public void PrintArrayStack() {
        if (isEmpty()) {
            System.out.printf("stack is Empty\n");
        }

        System.out.printf("stack size()=%d\n", size());

        int i = size() - 1;
        while (i >= 0) {
            System.out.println(data[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        String tmp;
        GeneralArrayStack<String> astack = new GeneralArrayStack<String>(String.class);

        // 将10, 20, 30 依次推入栈中
        astack.push("10");
        astack.push("20");
        astack.push("30");

        // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
        tmp = astack.pop();
        System.out.println("tmp=" + tmp);

        // 只将“栈顶”赋值给tmp，不删除该元素.
        tmp = astack.peek();
        System.out.println("tmp=" + tmp);

        astack.push("40");
        astack.PrintArrayStack();    // 打印栈
    }
}
