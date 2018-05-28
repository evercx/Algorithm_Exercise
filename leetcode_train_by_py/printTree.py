

# https://leetcode.com/problems/print-binary-tree/description/

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def printTree(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[str]]
        """

        deep = self.deepTree(root)
        print("deep",deep)

        # 结果数组的尺寸

        # 每行的元素个数
        number = pow(2,deep)-1

        result = [ [ "" for j in range(number)] for i in range(deep)]

        self.dfs(root,0,result,0,number-1)

        return result



    def dfs(self,node,deep,result,left,right):

        mid = int((left + right) / 2)
        result[deep][mid] = str(node.val)

        if node.left:
            self.dfs(node.left,deep+1,result,left,mid-1)
        if node.right:
            self.dfs(node.right,deep+1,result,mid+1,right)

    def deepTree(self,root):

        if root == None:
            return 0

        left_deep = self.deepTree(root.left) + 1
        right_deep = self.deepTree(root.right) + 1

        return max(left_deep,right_deep)




root = TreeNode("1")
root.left = TreeNode("2")
root.left.right = TreeNode("4")
root.right = TreeNode("3")


result = Solution().printTree(root)

for i in range(len(result)):
    print(result[i])

