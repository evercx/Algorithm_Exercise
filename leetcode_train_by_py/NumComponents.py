

# https://leetcode.com/problems/linked-list-components/description/

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def numComponents(self, head, G):
        """
        :type head: ListNode
        :type G: List[int]
        :rtype: int
        """

        res = 0
        p_h = head
        temp = ListNode(0)
        p_t = temp

        while p_h != None:


            if p_h.val in G:

                if p_h.next == None or p_h.next.val not in G:
                    res += 1

            p_h = p_h.next


        return res



    def find_item_in_list(self,G,item):

        G.sort()

        for i in range(len(G)):
            if G[i] == item:
                return i
            if G[i] > item:
                break

        return -1






head = ListNode(0)
head.next = ListNode(1)
head.next.next = ListNode(2)
head.next.next.next = ListNode(3)
G = [0,1,3]

head2 = ListNode(0)
head2.next = ListNode(1)
head2.next.next = ListNode(2)
head2.next.next.next = ListNode(3)
head2.next.next.next.net = ListNode(4)
G2 = [0,3,1,4]





result = Solution().numComponents(head,G)
result2 = Solution().numComponents(head2,G2)

print(result)
print(result2)


