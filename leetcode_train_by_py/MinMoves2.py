class Solution:
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        nums.sort()

        mid_index  = int(len(nums) / 2)

        res  = 0

        for i in range(len(nums)):
            res += abs(nums[mid_index] - nums[i])

        return res


class Solution2:
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        nums.sort()

        mid_index  = int(len(nums) / 2)

        res  = 0

        for i in range(mid_index+1):
            res += abs(nums[mid_index] - nums[i])

        return 2 * res



result_list = Solution().minMoves2([1,1,3])
result_list2 = Solution2().minMoves2([1,1,3])

print(result_list2)