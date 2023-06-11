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
        self.ino(r.left)
        self.ans.append(r.val)
        self.ino(r.right)
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:

        self.ans=[]

        self.ino(root)

        return self.ans