
# https://leetcode.com/problems/rabbits-in-forest/description/


# 计算数组外还剩最小的兔子数，然后把数组长度和数组外的兔子数相加就是结果

class Solution:
    def numRabbits(self, answers):
        """
        :type answers: List[int]
        :rtype: int
        """

        if len(answers) == 0 : return []

        answered_number_dict = {}

        for rabbit in answers:

            if rabbit == 0: continue    # 如果回答是0 就不算进字典 只有这个小白兔一个

            if rabbit in answered_number_dict:
                answered_number_dict[rabbit] += 1
            else:
                answered_number_dict[rabbit] = 1


        other_rabbit_number = 0

        for key,value in answered_number_dict.items():
            print(key,value)

            if value > key:

                value= (value % (key+1))

            if value != 0:

                other_rabbit_number += (key + 1 - value)


        return len(answers) + other_rabbit_number




answers = [1,1,2]
answers = [10,10,10]

answers = [1,0,1,0,0]
answers = [0,0,1,1,1]

answers = [2,1,2,2,2,2,2,2,1,1]

result = Solution().numRabbits(answers)

print(result)





