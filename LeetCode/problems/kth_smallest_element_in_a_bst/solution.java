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
    int ele,res;

    public void in(TreeNode r,int t){
        if(r==null)return;
        in(r.left,t);
        ele+=1;
        if(ele==t){
            res=r.val;
        }
        in(r.right,t);
    }
    public int kthSmallest(TreeNode root, int k) {

        in(root,k);
        return res;
        
    }
}