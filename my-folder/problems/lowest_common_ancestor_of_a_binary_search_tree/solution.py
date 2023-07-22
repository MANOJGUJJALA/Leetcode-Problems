# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:

    def lc(self,rt,l,r):
        if rt is None:
            return rt
        if rt.val==l.val or rt.val==r.val:
            return rt
        elif rt.val>l.val and rt.val>r.val:
            return self.lc(rt.left,l,r)
        elif rt.val<l.val and rt.val<r.val:
            return self.lc(rt.right,l,r)
        else:
            return rt
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':

        return self.lc(root,p,q)
