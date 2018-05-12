# https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/

"""
        这里从两个字符串的开头字符考虑，一个一个得考虑到最后一个，我们用二维数组dp[i][j]代表字符串1前i个字符和字符串2前j个字符实现相同所需要
       删除的ASCII value,有三种方法可以到达dp[i][j]:
       1.dp[i-1][j] + str1[i]:由于从dp[i-1][j]到dp[i][j]是多考虑了str1的一个字符，但是str2字符数没变，所以要想相同，必须删除str[i],考虑value的话就是加上str[i]
       2.dp[i][j-1] + str1[j]:对应于1，这个是多考虑str2的一个字符，所以要删除str2[j]
       3.dp[i-1][j-1] + a，这里是考虑两个str都加了一个，所以str1[i] =str2[j]时，a=0；str1[i] ！=str2[j]时，两个都要删除，a=str1[i] +str2[j]
       这三种情况每次比较出最小的来，最后返回dp[str1.length][str2.length](这里字符串下标从1开始，因为我们考虑dp数组的第0行代表str1还啥也没有，第0列代表str2啥也没有)

        https://www.cnblogs.com/stAr-1/p/7719289.html
"""

class Solution:
    def minimumDeleteSum(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: int
        """

        dp = []

        for i in range(0,len(s1)+1):
            dp.append([])
            for j in range(0,len(s2)+1):
                dp[i].append(0)

        for i in range(1,len(s1)+1):
            dp[i][0] = dp[i-1][0] + ord(s1[i-1])

        for j in range(1,len(s2)+1):
            dp[0][j] = dp[0][j-1] + ord(s2[j-1])



        for i in range(1,len(s1)+1):
            for j in range(1,len(s2)+1):
                a = 0
                if s1[i-1] != s2[j-1]:
                    a = ord(s1[i-1]) + ord(s2[j-1])

                dp[i][j] = min(dp[i-1][j-1] + a, dp[i-1][j] + ord(s1[i-1]),dp[i][j-1] + ord(s2[j-1]))

        # for i in range(len(s1)+1):
        #
        #     current_str = ""
        #
        #     for j in range(len(s2)+1):
        #         current_str += str(dp[i][j]) + " "
        #     print(current_str)


        return dp[len(s1)][len(s2)]






s1 = "sea"
s2 = "eat"

r = Solution().minimumDeleteSum(s1,s2)
print(r)