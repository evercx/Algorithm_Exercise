package Easy.LinkedList;

/**
 * Created by EVERCX on 2017/9/13.
 *
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode result = head;

        while(head.next != null){

            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }

}
