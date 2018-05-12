

#  https://leetcode.com/problems/shortest-completing-word/description/


class Solution:
    def shortestCompletingWord(self, licensePlate, words):
        """
        :type licensePlate: str
        :type words: List[str]
        :rtype: str
        """

        licensePlate_dict = {}
        licensePlate = licensePlate.lower()

        res = ""

        for c in licensePlate:
            if c >= 'a' and c <= 'z':

                if c not in licensePlate_dict:
                    licensePlate_dict[c] = 1
                else:
                    licensePlate_dict[c] += 1


        lengh = 1001
        for word in words:
            license_dict = licensePlate_dict.copy()

            for l in word:
                if l in license_dict:
                    license_dict[l] -= 1
                    if license_dict[l] == 0:
                        del license_dict[l]

                if not license_dict:
                    if len(word) < lengh:
                        res = word
                        lengh = len(word)

        return res









r = Solution().shortestCompletingWord("1s3 PSt",["step", "steps", "stripe", "stepple"])
r2 = Solution().shortestCompletingWord("1s3 456",["looks", "pest", "stew", "show"])

print(r2)
