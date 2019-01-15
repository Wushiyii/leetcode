package question;

public class Q328_Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head,even = head.next,evenCopy = even;//偶数开头拷贝
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenCopy;
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Q328_Odd_Even_Linked_List demo = new Q328_Odd_Even_Linked_List();
        ListNode listNode = demo.oddEvenList(a);
        System.out.println(listNode.val);
    }
}
