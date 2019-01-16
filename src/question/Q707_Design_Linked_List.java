package question;

public class Q707_Design_Linked_List {

    Node head,tail;
    int size;

    class Node {
        int val;
        Node pre;
        Node next;
        Node(int x) { val = x; }

    }

    /** Initialize your data structure here. */
    public Q707_Design_Linked_List() {
       head = new Node(0);
       tail = new Node(0);
       head.next = tail;
       tail.pre = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if ( index < 0 || index >= size) return -1;
        Node cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
       this.addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
       this.addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if ( index < 0 || index > size) return;
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Node tmp = new Node(val);
        tmp.next = cur.next;
        tmp.next.pre = tmp;
        cur.next = tmp;
        tmp.pre = cur;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if ( index < 0 || index >= size) return;
        Node cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        cur.next.pre =  cur.pre;
        cur.pre.next = cur.next;
        size--;
    }
}
