class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;

        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());

        //converting matrix to list
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j] == 1   &&  i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int[] visited=new int[v];
        int count=0;

        for(int i=0;i<v;i++){
            if(visited[i]==0){
                count++;
                dfs(i,adj,visited);
            }
        }

        return count;
    }
    void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[node]=1;
        for(int i:adj.get(node)){
            if(visited[i]==0)
                dfs(i,adj,visited);
        }
    }
}