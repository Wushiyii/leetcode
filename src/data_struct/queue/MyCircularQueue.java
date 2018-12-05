package data_struct.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyCircularQueue {

    private int[] data;
    private int start;
    private int end;
    private int size;
    private int count;

    public MyCircularQueue(int k) {
        data = new int[k];
        start = -1;
        end = -1;
        size = k;
        count = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            this.start = 0;
        }
        end = (end + 1) % size;
        this.data[end] = value;
        this.count ++ ;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(this.start == this.end ){
            this.start = -1;
            this.end = -1;
            this.count --;
            return true;
        }
        start = (start + 1) % size;
        this.count --;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return this.data[start];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return this.data[end];
    }

    public boolean isEmpty() {
        return start == -1;
    }

    public boolean isFull() {
        return ((end + 1) % size ) == start;
    }


    /**
     * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
     *
     * For example,
     *
     * MovingAverage m = new MovingAverage(3);
     * m.next(1) = 1
     * m.next(10) = (1 + 10) / 2
     * m.next(3) = (1 + 10 + 3) / 3
     * m.next(5) = (10 + 3 + 5) / 3
     */
    private int sum = 0;
    public int next(int val ){
        sum += val;
        this.enQueue(val);
        if(this.count > 3) {
            sum -= this.Front();
            this.deQueue();
        }
        return sum/this.count;
    }

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(3);
        System.out.println(queue.next(1));
        System.out.println(queue.next(3));
        System.out.println(queue.next(5));
        System.out.println(queue.next(1));
    }
}
