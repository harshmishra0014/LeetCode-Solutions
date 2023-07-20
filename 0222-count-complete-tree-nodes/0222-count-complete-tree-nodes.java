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
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int lh=lheight(root);
        int rh=rheight(root);
        if(lh==rh)
            return (int)Math.pow(2,lh)-1;
        else
            return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int lheight(TreeNode r){
        if(r==null)
            return 0;
        return 1+lheight(r.left);
    }
    public int rheight(TreeNode r){
        if(r==null)
            return 0;
        return 1+rheight(r.right);
    }
}


