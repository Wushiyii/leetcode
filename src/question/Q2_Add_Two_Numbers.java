package question;

public class Q2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode dummyHead = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            dummy.next = new ListNode(carry%10);
            dummy = dummy.next;
            carry /= 10;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(1);
        a.next = b;
        Q2_Add_Two_Numbers demo = new Q2_Add_Two_Numbers();
        ListNode listNode = demo.addTwoNumbers(a, c);
        System.out.println(listNode);
    }
}
