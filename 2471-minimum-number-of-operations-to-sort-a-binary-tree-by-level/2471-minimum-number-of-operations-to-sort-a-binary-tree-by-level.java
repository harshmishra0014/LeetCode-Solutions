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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        int res=0;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l =new ArrayList<Integer>();
            while(s>0){
                TreeNode current=q.poll();
                if (current.left !=null){
                    q.offer(current.left);
                    l.add(current.left.val);
                }
                if(current.right!=null){
                    q.offer(current.right);
                    l.add(current.right.val);
                }
                s--;
            }
            res+=countSwap(l);
        }
        return res;
    }
    int countSwap(List<Integer> l){
        int swap=0;
        int[] sl=new int[l.size()];
        for(int i=0;i<l.size();i++)
            sl[i]=l.get(i);
        Arrays.sort(sl);
        
        HashMap<Integer,Integer> d = new HashMap<Integer,Integer>();
        
        for(int i=0;i<l.size();i++)
            d.put(l.get(i),i);
        
        for(int i=0;i<l.size();i++){
            if(l.get(i)!=sl[i]){
                d.put(l.get(i),d.get(sl[i]));
                l.set(d.get(sl[i]),l.get(i));
                swap++;
            }
        }
        return swap;
    }
    
}