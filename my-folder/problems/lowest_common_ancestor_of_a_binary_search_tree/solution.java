/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lca(TreeNode r,TreeNode a,TreeNode b){
        if(r==null){
            return r;
        }
        else if(r.val==a.val || r.val==b.val){
            return r;
        }
        else if(r.val>a.val && r.val>b.val){
            return lca(r.left,a,b);
        }
        else if(r.val<a.val && r.val<b.val){
            return lca(r.right,a,b);
        }
        else{
            return r;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return lca(root,p,q);
        
    }
}