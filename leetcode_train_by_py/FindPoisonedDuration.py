# https://leetcode.com/problems/teemo-attacking/description/



class Solution:
    def findPoisonedDuration(self, timeSeries, duration):
        """
        :type timeSeries: List[int]
        :type duration: int
        :rtype: int
        """

        res = 0

        if not timeSeries: return 0

        for i in range(1,len(timeSeries)):
            if timeSeries[i] - timeSeries[i-1] < duration:
                res += (timeSeries[i] - timeSeries[i-1])
            else:
                res += duration


        res += duration



        return res





timeSeries =  [1, 4]
duration = 2
r = Solution().findPoisonedDuration(timeSeries,duration)
print(r)