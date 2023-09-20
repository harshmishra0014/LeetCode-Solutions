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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            int t = n;
            double s = 0;
            while(n-- > 0){
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                s += q.poll().val;
            }
            ans.add(s/t);
        }
        return ans;
    }
}