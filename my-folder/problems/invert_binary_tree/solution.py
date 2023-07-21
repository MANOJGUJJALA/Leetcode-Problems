# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def inv(self,r):
        if r is None:
            return
        rl=self.inv(r.left)
        rr=self.inv(r.right)
        r.left=rr
        r.right=rl
        return r
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        return self.inv(root)