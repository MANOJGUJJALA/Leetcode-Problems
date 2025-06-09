/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean tree(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q==null || p.val!=q.val)return false;
        return tree(p.left,q.left)&&tree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null)return false;

        if(root.val==subRoot.val) {
            if(tree(root,subRoot)){
                return true;
            }
        }
        boolean z=isSubtree(root.left,subRoot);
        if(z)return true;

        boolean o=isSubtree(root.right,subRoot);
        if(o)return true;

        return false;

    }
}