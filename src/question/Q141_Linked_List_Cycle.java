package question;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Q141_Linked_List_Cycle {
    //使用hash表
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while ( head != null) {
            if (nodeSet.contains(head)) {
                return true;
            } else {
                nodeSet.add(head);
            }
            head = head.next;
        }
        return false;
    }
    //双指针
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            ListNode node = new ListNode(1);
            node.next = new ListNode(2);
            Q141_Linked_List_Cycle demo = new Q141_Linked_List_Cycle();
            boolean b = demo.hasCycle2(node);
            System.out.println(b);

        }
}
