package Easy.LinkedList;
/**
 * Created by EVERCX on 2017/8/21.
 *
 * https://leetcode.com/problems/delete-node-in-a-linked-list/description/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNode {

    public void deleteNode(ListNode node) {

        if(node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }

}



