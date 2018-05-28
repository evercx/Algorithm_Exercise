


# https://leetcode-cn.com/problems/array-nesting/description/

class Solution:
    def arrayNesting(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        result = 0

        visit = [False for i in range(len(nums))]

        for i in range(len(nums)):

            if visit[i] == False:

                S = []
                current_num = nums[i]
                visit[i] = True
                while current_num != i:

                    visit[current_num] = True
                    S.append(current_num)
                    current_num = nums[current_num]

                result = max(result,len(S)+1)

        return result








nums = [5,4,0,3,1,6,2]

r = Solution().arrayNesting(nums)
print(r)

