package Easy.LinkedList;

import java.util.List;

/**
 * Created by EVERCX on 2017/10/18.
 *
 * https://leetcode.com/problems/linked-list-cycle/description/
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) return false;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != slow){

            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;

    }
}
