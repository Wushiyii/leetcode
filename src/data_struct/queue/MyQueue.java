package data_struct.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Object> data;
    private int index;
//    private int capacity = 16;

    public MyQueue() {
        this.index = 0;
        this.data = new ArrayList<>();
    }

    public boolean enQueue(Object o){
        this.data.add(o);
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        index++;
        return true;
    }

    public boolean isEmpty(){
        return index >= data.size();
    }

    public Object getFront(){
        return this.data.get(index);
    }


    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(1);
        if (!q.isEmpty()) {
            System.out.println(q.getFront());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.getFront());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.getFront());
        }
        q.deQueue();
        System.out.println(q.isEmpty());
    }
}
