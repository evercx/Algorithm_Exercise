package Easy.LinkedList;

/**
 * Created by EVERCX on 2017/9/2.
 *
 *
 *
 * https://leetcode.com/problems/reverse-linked-list/description/
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class ReverseList {

    public ListNode reverseList(ListNode head) {

        if(head == null) return null;

        ListNode resList = new ListNode(head.val);

        ListNode h = head;
        while(h.next != null){
            ListNode tempnNode = head.next;
            tempnNode.next = resList;
            resList = tempnNode;
            h = h.next;
        }

        return resList;
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);


    }
}
