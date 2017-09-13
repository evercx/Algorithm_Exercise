package Easy.LinkedList;

/**
 * Created by EVERCX on 2017/9/13.
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode res = null;

        if(l1.val <= l2.val){
            res = l1;
            res.next = mergeTwoLists(l1.next,l2);
        }else{
            res = l2;
            res.next = mergeTwoLists(l1,l2.next);
        }

        return res;
    }

    public static void main(String[] args) {

        ListNode l1= new ListNode(2);
        ListNode l2 = new ListNode(1);

        ListNode n = new MergeTwoLists().mergeTwoLists(l1,l2);

    }
}
