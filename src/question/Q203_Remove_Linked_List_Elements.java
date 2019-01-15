package question;

public class Q203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode( 0 == val?1:0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next!=null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Q203_Remove_Linked_List_Elements demo = new Q203_Remove_Linked_List_Elements();
        ListNode listNode = demo.removeElements(a, 6);
        System.out.println(listNode.val);
    }
}
