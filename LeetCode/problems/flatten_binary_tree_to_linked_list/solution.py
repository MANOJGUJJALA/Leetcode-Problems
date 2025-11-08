# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:

        st=[]
        if root is None:
            return

        st.append(root)

        while len(st):

            node=st.pop(-1)
            if node.right:
                st.append(node.right)
            
            if node.left:
                st.append(node.left)
            node.left=None
            if len(st):

                node.right=st[-1]
        return root
        