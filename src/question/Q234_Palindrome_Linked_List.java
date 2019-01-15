package question;

public class Q234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head,fast = head,dummy = new ListNode(0);;
        //获取中点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //反转链表
        dummy.next = slow;
        while (slow.next != null) {
            ListNode tmp = slow.next;
            slow.next = slow.next.next;
            tmp.next = dummy.next;
            dummy.next = tmp;
        }
        slow = dummy.next;
        //判断每一个元素
        while (slow != null) {
            if (slow.val != head.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        a.next = b;
        b.next = c;
        Q234_Palindrome_Linked_List demo = new Q234_Palindrome_Linked_List();
        boolean palindrome = demo.isPalindrome(a);
        System.out.println(palindrome);
    }
}
