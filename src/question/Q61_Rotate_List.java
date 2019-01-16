package question;

public class Q61_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) return head;
        ListNode copy = head;
        ListNode tail = null;
        int length = 0;
        while (copy!=null) {
            length++;
            if (copy.next == null) {
                tail = copy;
            }
            copy = copy.next;
        }
        k = k % length;
        tail.next = head;
        for (int i = 0; i < length - k; i++) {
            tail = tail.next;
        }
        copy = tail.next;
        tail.next = null;
        return copy;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        Q61_Rotate_List demo = new Q61_Rotate_List();
        demo.rotateRight(a,2);
    }
}
