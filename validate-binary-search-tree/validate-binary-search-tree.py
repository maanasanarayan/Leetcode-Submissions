# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.valid(root, float("-inf"), float("inf"))
        
    def valid(self, root, low, high):
        if root == None:
            return True

        if low >= root.val or root.val >= high:
            return False

        return self.valid(root.left, low, root.val) and self.valid(root.right, root.val, high)
        