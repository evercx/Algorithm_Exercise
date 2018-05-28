#  https://leetcode.com/problems/escape-the-ghosts/description/


class Solution:
    def escapeGhosts(self, ghosts, target):
        """
        :type ghosts: List[List[int]]
        :type target: List[int]
        :rtype: bool
        """

        need_steps = abs(target[0]) + abs(target[1])

        for i in range(len(ghosts)):

            current_ghost_need_step = abs(ghosts[i][0] - target[0]) + abs(ghosts[i][1] - target[1])

            if current_ghost_need_step <= need_steps:
                return False

        return True




ghosts = [[1, 0], [0, 3]]
target = [0, 1]

ghosts =  [[1,9],[2,-5],[3,8],[9,8],[-1,3]]
target = [8,-10]

result = Solution().escapeGhosts(ghosts,target)

print(result)







