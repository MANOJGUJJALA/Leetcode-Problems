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
    int c;

    public void in(TreeNode r,int m){
        if(r==null)return ;
        if(r.val>=m){
            m=r.val;
            c+=1;
        }
         in(r.left,m);
         in(r.right,m);
         
    }

    public int goodNodes(TreeNode root) {
        if(root==null)return 0;

        int m=root.val;
        in(root,m);
        return c;
        
    }
}