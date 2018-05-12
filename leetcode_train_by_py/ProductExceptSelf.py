
# https://leetcode.com/problems/product-of-array-except-self/description/

class Solution:
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        res = [ 1 for i in range(len(nums))]
        temp = [1 for i in range(len(nums))]

        for i in range(1,len(nums)):

            temp[i] = temp[i-1] * nums[i-1]
            res[i] = temp[i]

        temp[len(nums)-1] = 1
        for i in range(len(nums)-2,-1,-1):

            temp[i] = temp[i+1] * nums[i+1]
            res[i] = res[i] * temp[i]


        return res




nums = [1,2,3,4]

r = Solution().productExceptSelf(nums)

print(r)
