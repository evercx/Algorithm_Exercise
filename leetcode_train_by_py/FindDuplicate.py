
# https://leetcode.com/problems/find-duplicate-file-in-system/description/


class Solution:
    def findDuplicate(self, paths):
        """
        :type paths: List[str]
        :rtype: List[List[str]]
        """
        dcplicate_dict = {}
        result_list = []

        for f in paths:
            files = f.split(" ")

            for i in range(1, len(files)):

                index = files[i].find("(")
                file_path = files[0] + "/" + files[i][:index]
                file_content = files[i][index:]

                if file_content in dcplicate_dict:

                    file_path_list = dcplicate_dict[file_content]
                    file_path_list.append(file_path)
                    dcplicate_dict[file_content] = file_path_list
                else:
                    dcplicate_dict[file_content] = [file_path]

        for item in dcplicate_dict:
            if len(dcplicate_dict[item]) > 1:
                result_list.append(dcplicate_dict[item])

        return result_list


paths = ["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]

p = Solution().findDuplicate(paths)
print(p)

