
# https://leetcode.com/problems/beautiful-arrangement-ii/description/


class Solution:
    def constructArray(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[int]
        """
        res = []
        left = 1
        right = n

        for i in range(0,k):

            if i % 2 == 0:
                res.append(left)
                left += 1
            else:
                res.append(right)
                right = right - 1

        # if i % 2 == 1:
        for j in range(left,right+1):
            res.append(j)



        return res



r = Solution().constructArray(5,2)

print(r)