class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int[] i : edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        boolean[] visited = new boolean[n];
        bfs(source,adj,visited);
        return visited[destination];
        
    }
    private void bfs(int src,List<List<Integer>> adj,boolean[] visited){
        visited[src]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int a=q.poll();
            for(int i:adj.get(a)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
}