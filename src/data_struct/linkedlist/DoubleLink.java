package data_struct.linkedlist;

import java.util.Optional;

public class DoubleLink<T> {
    private class DNode<T> {
        public DNode<T> prev;
        public DNode<T> next;
        public T value;

        public DNode(DNode<T> prev, DNode<T> next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private DNode<T> head;
    private int count;

    public DoubleLink() {
        head = new DNode<T>(null,null,null);
        head.prev = head.next = head;
        count = 0;
    }

    public int size(){return this.count;}

    public boolean isEmpty(){
        return this.count == 0;
    }
    private DNode<T> getNode(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        //正向查找
        DNode<T> node;
        if (index <= count/2) {
            node = head.next;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = head.prev;
            for (int i = 0; i < count - index - 1; i++) {
                node = node.prev;
            }
        }
        return node;
    }

    public T get(int index) {
        return getNode(index).value;
    }
    public T getFirst() {
        return getNode(0).value;
    }
    public T getLast() {
        return getNode(count-1).value;
    }
    public void insert(int index,T t) {
        if (index == 0) {
            DNode<T> node = new DNode<>(head,head.next,t);
            head.next.prev = node;
            head.next = node;
            count++;
        }else {
            DNode<T> cur = getNode(index);
            DNode<T> node = new DNode<>(cur.prev,cur,t);
            cur.prev.next = node;
            cur.prev = node;
            count++;
        }
    }

    public void insertFirst(T t) {
        insert(0,t);
    }
    public void appendLast(T t){
        DNode<T> node = new DNode<>(head.prev,head,t);
        head.prev.next = node;
        head.prev = node;
        count++;
    }
    public void del(int index){
        DNode<T> node = getNode(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node = null;
        count--;
    }
    public void deleteFirst() {
        del(0);
    }
    public void deleteLast() {
        del(count-1);
    }


}
