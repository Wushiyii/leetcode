package data_struct.queue;

public class ArrayQueue {
    private int[] data;
    private int count;

    public ArrayQueue(int size) {
        this.data = new int[size];
        this.count = 0;
    }

    public void inqueue(int t) {
        this.data[count++] = t;
    }

    public int front() {
        return this.data[0];
    }

    public int dequeue() {
        int temp = data[0];
        System.arraycopy(data, 1, data, 0, count);
        count--;
        return temp;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        int tmp = 0;
        ArrayQueue astack = new ArrayQueue(12);

        // 将10, 20, 30 依次推入栈中
        astack.inqueue(10);
        astack.inqueue(20);
        astack.inqueue(30);

        // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
        tmp = astack.dequeue();
        System.out.printf("tmp=%d\n", tmp);

        // 只将“栈顶”赋值给tmp，不删除该元素.
        tmp = astack.front();
        System.out.printf("tmp=%d\n", tmp);

        astack.inqueue(40);

        System.out.printf("isEmpty()=%b\n", astack.isEmpty());
        System.out.printf("size()=%d\n", astack.size());
        while (!astack.isEmpty()) {
            System.out.printf("size()=%d\n", astack.dequeue());
        }
    }
}
