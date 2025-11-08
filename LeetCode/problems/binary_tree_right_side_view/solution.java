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
    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>l=new ArrayList<>();
        if(root==null)return l;
        q.add(root);

        while(q.size()>0){

            int k=q.size();

            for(int i=0;i<k;i++){
                TreeNode p=q.poll();
                if(i==(k-1))l.add(p.val);

                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
            }
        }
        return l;
        
    }
}