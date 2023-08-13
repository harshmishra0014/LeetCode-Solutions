class Solution {
    public boolean isBipartite(int[][] graph) {
        BipartiteDFS obj = new BipartiteDFS();
        BipartiteBFS obj1 = new BipartiteBFS();
        return obj.isBipartite(graph);
        //obj1.isBipartite(graph);
    }
}
class BipartiteDFS{
    boolean isBipartite(int[][] graph){
        int v = graph.length;
        int[]color = new int[v];
        for(int i = 0; i < v; i++) color[i] = -1;

        for(int i = 0; i < v; i++){
            if(color[i] == -1){
                if(dfs(i, 0, color, graph) == false)
                    return false;
            }
        }
        return true;
    }

    private static boolean dfs(int node, int col, int[] color, int[][] graph) {
        color[node] = col;
        for(int i : graph[node]){
            if(color[i] == -1){
                if(dfs(i, 1 - col, color, graph) == false)
                    return false;
            }
            else if(color[i] == col)
                return false;
        }
        return true;
    }
}
class BipartiteBFS{
    boolean isBipartite(int[][] graph){
        int v = graph.length;
        int[]color = new int[v];
        for(int i = 0; i < v; i++) color[i] = -1;

        for(int i = 0; i < v; i++){
            if(color[i] == -1) {
                if (check(i, v, graph, color) == false)
                    return false;
            }
        }
        return true;
    }

    private static boolean check(int start, int v, int[][] graph, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            for(int i : graph[node]){
                /*
                  if the adjacent node is not colored then we will give it the opposite color
                 */
                if(color[i] == -1){
                    color[i] = 1 - color[node];
                    q.offer(i);
                }
                /*
                  if the adjacent node is colored and having same color then return false
                 */
                else if(color[i] == color[node])
                    return false;
            }
        }
        return true;
    }
}