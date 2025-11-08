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
    public boolean isValidBST(TreeNode root) {
        //Approach: Using dfs, T.C: O(n), n is the height of the tree
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean dfs(TreeNode root, long min, long max){
        //base case
        if(root==null) return true;

        //if the root.val is less than or greater than the min or max value,
        //than obiously we cannot find the solution
        if(root.val>=max || root.val<=min) return false;

        //call recursion for left and right subtree
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
}