package data_struct.linkedlist;

class MyLinkedList {

    Node head;
    int size;

    class Node {
        int val;
        Node next;
        Node(int x) { val = x; }

    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index > size - 1 || size < 0) return -1;
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (this.head == null) {
            this.head = new Node(val);
        } else {
            Node cur = new Node(val);
            cur.next = this.head;
            this.head = cur;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (size == 0) {
            this.addAtHead(val);
        }else {
            Node cur = this.head;
            for (int i = 0; i < size - 1; i++) {
                cur = cur.next;
            }
            cur.next = new Node(val);
            size++;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        } else if (index == 0){
            this.addAtHead(val);
        } else if (index == size) {
            this.addAtTail(val);
        }else {
            Node cur = this.head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            Node node = new Node(val);
            node.next = cur.next;
            cur.next = node;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index > size - 1) {
            return;
        }else {
            Node cur = this.head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3,0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        linkedList.get(4);
        linkedList.addAtHead(4);
        linkedList.addAtIndex(5,0);
        linkedList.addAtHead(6);

    }
}