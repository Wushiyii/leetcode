package question;


import java.util.HashSet;
import java.util.Set;

public class Q142_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)){
                return head;
            }else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
