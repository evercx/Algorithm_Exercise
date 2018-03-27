package Easy.LinkedList;

/**
 * Created by EVERCX on 2017/10/18.
 *
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode resultPoint = head;
        ListNode resultHead = resultPoint;

        if(head == null) return null;
        if(head.next == null && head.val == val) return null;
        if(head.next == null && head.val != val) return head;

        while(head.next != null){
            if( head.val == val){
                resultPoint.val = head.next.val;
                resultPoint.next = head.next.next;
            }
            head = head.next;
            resultPoint = resultPoint.next;

        }

        return resultHead;

    }
}
