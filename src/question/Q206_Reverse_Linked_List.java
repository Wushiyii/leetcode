package question;

public class Q206_Reverse_Linked_List {
    /**
     * 迭代
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head.next != null) {
            ListNode tmp = head.next;
            head.next = head.next.next;
            tmp.next = dummy.next;
            dummy.next = tmp;
        }
        return dummy.next;
    }

    /**
     * 采用递归
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if ( head == null || head.next == null) return head;
        ListNode node =  reverseList2(head.next);
        node.next.next = head;
        node.next = null;
        return node;
    }
}
