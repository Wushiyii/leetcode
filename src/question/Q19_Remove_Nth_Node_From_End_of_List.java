package question;

public class Q19_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pA = dummy;
        ListNode pB = dummy;
        for (int i = 0; i < n + 1; i++) {
            pA = pA.next;
        }
        while (pA != null) {
            pA = pA.next;
            pB = pB.next;
        }
        pB.next = pB.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(4);
//        ListNode e = new ListNode(5);
        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;

        Q19_Remove_Nth_Node_From_End_of_List demo = new Q19_Remove_Nth_Node_From_End_of_List();
        System.out.println(demo.removeNthFromEnd(a, 2).val);
    }
}
