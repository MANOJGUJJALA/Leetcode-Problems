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
    private int dia=0;
   

    public int diameterOfBinaryTre(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int l=diameterOfBinaryTre(root.left);
        int r=diameterOfBinaryTre(root.right);
        dia=Math.max((l+r),dia);
        return Math.max(l,r)+1;
    }

     public int diameterOfBinaryTree(TreeNode root) {
        
     int h= diameterOfBinaryTre(root);
      return dia;
    }

}