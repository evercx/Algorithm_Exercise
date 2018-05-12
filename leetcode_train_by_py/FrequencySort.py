
# https://leetcode.com/problems/sort-characters-by-frequency/description/

# 通排序 https://blog.csdn.net/lzuacm/article/details/51290130

class Solution:
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        word_dict = {}

        for c in s:
            if c not in word_dict:
                word_dict[c] = 1
            else:
                word_dict[c] += 1

        index_list = []
        for i in range(len(s)+1):
            index_list.append([])

        for word_key,word_value in word_dict.items():
            index_list[word_value].extend( [ word_key for i in range(word_value) ] )

        res = ""
        index_list_length = len(index_list)

        for i in range(index_list_length):
            current_list = index_list[index_list_length-1 - i]
            for j in range( len(current_list)):
                res += index_list[index_list_length-1 - i][j]

        return res





r = Solution().frequencySort("tree")

print(r)



