package question;

public class Q160_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode b = headB;
        while (b.next != null) {
            b = b.next;
        }
        b.next = headB; //形成环
        ListNode slow = headA;
        ListNode fast = headA;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = headA;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                b.next = null; //恢复原始结构
                return slow;
            }
        }
        b.next = null;
        return null;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(4);
        ListNode f = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = f;

        ListNode a1 = new ListNode(5);
        ListNode b1 = new ListNode(0);
        ListNode c1 = new ListNode(1);

        Q160_Intersection_of_Two_Linked_Lists demo = new Q160_Intersection_of_Two_Linked_Lists();
        ListNode intersectionNode = demo.getIntersectionNode(a, a1);
        System.out.println(intersectionNode.val);
    }
}
