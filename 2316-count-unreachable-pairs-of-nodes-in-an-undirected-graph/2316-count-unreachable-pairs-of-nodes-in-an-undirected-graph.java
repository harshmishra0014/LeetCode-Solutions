class Solution1 {
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



class Solution2{
    public long countPairs(int n, int[][] edges){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }

        int[] visited=new int[n];
        System.out.println(adj);
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                visited[i]=1;
                int c=1;
                q.add(visited[i]);                
                while(!q.isEmpty())
                {
                    int a=q.poll();
                    for(int j:adj.get(a))
                    {
                        if(visited[j]==0)
                        {
                            visited[j]=1;
                            c++;
                            q.add(j);
                        }
                    }
                }
                res.add(c);
            }
            
        }
        System.out.println(res);
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
}
class Solution{
    public long countPairs(int n, int[][] edges){
         int vis[] = new int[n];
        long ans = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i[] : edges) {
            int u = i[0];
            int v = i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if (vis[i] == 0) {
                //cnt=1;
                // vis[i]=1;

                int v = dfs(i, adj, vis);
                list.add(v);
            }
        }
        long sum = 0;
        for (int a : list) {
            sum += a;
        }
        for (int i : list) {
            sum -= i;
            ans += i * sum;
        }
        return ans;
    }

    static int dfs(int i, List<List<Integer>> adj, int[] vis) {
        vis[i] = 1;
        int cnt = 1;
        for (int v : adj.get(i)) {
            if (vis[v] == 0) {
                //vis[v]=1;
                cnt = cnt + dfs(v, adj, vis);

            }
        }
        return cnt;
    }
}
