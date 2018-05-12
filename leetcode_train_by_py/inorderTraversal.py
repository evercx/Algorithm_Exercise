# https://leetcode.com/problems/binary-tree-inorder-traversal/description/



# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:

    res = []

    stack = []
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        node = root
        if node == None: return self.res

        current_node = node

        while len(self.stack ) > 0 or current_node:
            if current_node:
                self.stack.append(current_node)
                current_node = current_node.left
            else:
                current_node = self.stack.pop()
                self.res.append(current_node.val)
                current_node = current_node.right

        return self.res

    def traversal(self,node):

        if node == None:
            return

        self.traversal(node.left)
        self.res.append(node.val)
        self.traversal(node.right)
        return

    def iterativeTraversal(self,node):

        if node == None: return self.res

        current_node = node

        while len(self.stack ) > 0 or current_node:
            if current_node:
                self.stack.append(current_node)
                current_node = current_node.left
            else:
                current_node = self.stack.pop()
                self.res.append(current_node.val)
                current_node = current_node.right

        return self.res







root = TreeNode(1)
root.right = TreeNode(2)
root.right.left = TreeNode(3)


# r = Solution().inorderTraversal(root)
r = Solution().iterativeTraversal(root)
print(r)