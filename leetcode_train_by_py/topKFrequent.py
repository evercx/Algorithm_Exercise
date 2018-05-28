# https://leetcode.com/problems/top-k-frequent-elements/description/


class Solution:
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """

        frequent_dict = {}

        result = []

        for num in nums:

            if num in frequent_dict:
                frequent_dict[num] += 1
            else:
                frequent_dict[num] = 1

        heap = [[] for i in range(len(nums)+1)]

        for key,value in frequent_dict.items():

            heap[value].append(key)


        for i in range(len(heap)-1,-1,-1):

            if len(heap[i]) != 0:

                result.extend(heap[i])
                k = k - len(heap[i])

            if k == 0: break

        return result



nums = [1]
k = 1
r = Solution().topKFrequent(nums,k)
print(r)


