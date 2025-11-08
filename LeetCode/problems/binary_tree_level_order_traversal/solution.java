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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>r=new ArrayList<>();
        if(root==null)return r;
        q.add(root);

        while(q.size()!=0){
            
            int si=q.size();
            List<Integer>l=new ArrayList<>();

            for(int i=0;i<si;i++){
                TreeNode k=q.poll();
                l.add(k.val);
                if(k.left!=null)q.add(k.left);
                if(k.right!=null)q.add(k.right);

            }
            r.add(l);
        }
        return r;
        
    }
}