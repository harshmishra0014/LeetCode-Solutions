/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        if(root==null)
            return 0;
        int depth=0;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                Node a=q.poll();
                for(Node x:a.children){
                    q.offer(x);
                }
            }
            depth++;
        }
        return depth;
    }
}