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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        if(root==null)
            return 0;
        int depth=1;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                TreeNode a=q.poll();
                if(a.left==null && a.right==null)  return depth;
                else
                {
                    if(a.left!=null)    q.offer(a.left);
                    if(a.right!=null)   q.offer(a.right);
                }   
            }
            depth++;
        }
        return depth;
    }
}