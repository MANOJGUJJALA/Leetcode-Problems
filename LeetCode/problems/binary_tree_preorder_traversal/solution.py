# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def ino(self,r):
        if r is None:
            return
        self.r.append(r.val)
        self.ino(r.left)
        self.ino(r.right)
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        self.r=[]

        self.ino(root)

        return self.r