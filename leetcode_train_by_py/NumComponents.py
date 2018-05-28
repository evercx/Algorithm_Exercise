

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

            if self.find_item_in_list(G,p_h.val):

                if p_h.next == None or self.find_item_in_list(G,p_h.next.val) == False:
                    res += 1

            p_h = p_h.next


        return res



    def find_item_in_list(self,G,item):

        G.sort()

        left = 0
        right = len(G)

        while left < right:
            mid = int((right + left) / 2)
            if G[mid] == item: return True
            elif G[mid] > item:
                right = mid
            else:
                left = mid + 1
        return False





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


