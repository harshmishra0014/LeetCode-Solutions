class Solution {
    int count;
    public long countPairs(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }

        int[] visited=new int[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                count=1;
                //c++;
                dfs(i,adj,visited);
                res.add(count);
            }
        }
        long sum=0;
        for(int i:res)
            sum+=i;
        long ans=0;
        for(int i:res){
            sum-=i;
            ans+=i*sum;
        }
        return ans;
        
        
        
    }
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[node]=1;
        for(int i:adj.get(node)){
            if(visited[i]==0) {
                count++;
                dfs(i, adj, visited);
            }
        }
    }
}