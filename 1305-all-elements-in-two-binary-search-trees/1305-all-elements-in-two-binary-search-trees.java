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
    public void inOrder(TreeNode root,List<Integer> l){
        if(root == null)
            return;
        inOrder(root.left,l);
        l.add(root.val);
        inOrder(root.right,l);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        inOrder(root1,l1);
        inOrder(root2,l2);
        int x=0,y=0;
        while(x<l1.size() && y<l2.size()){
            if(l1.get(x)<l2.get(y)){
                ans.add(l1.get(x));
                x++;
            }
            else{
                ans.add(l2.get(y));
                y++;
            }
        }
        while(x<l1.size()){
            ans.add(l1.get(x++));
        }
        while(y<l2.size()){
            ans.add(l2.get(y++));
        }
        
        return ans;
        
    }
    
}