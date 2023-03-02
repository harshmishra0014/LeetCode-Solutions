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
    
    public List<Integer> inorderTraversal(TreeNode root){   
        ArrayList<Integer> ans=new ArrayList<>();
        findInorder(root,ans);
        return ans;
    }
    public void findInorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null)
            return;
        findInorder(root.left,ans);
        ans.add(root.val);
        findInorder(root.right,ans);
    }
}