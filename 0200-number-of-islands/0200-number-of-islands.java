class Pair{
    int first;
    int second;
    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
    int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        int count=0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (grid[row][col] == '1' && visited[row][col] == 0) {
                    count++;
                    bfs(row, col, grid, visited);

                }
            }
        }
        return count;
    }

    static void bfs(int row, int col, char[][] grid, int[][] visited) {
        Queue<Pair> q = new LinkedList<Pair>();
        visited[row][col]=1;
        int r = grid.length;
        int c = grid[0].length;
        int[] switchrow={0,+1,0,-1};
        int[] switchcol={+1,0,-1,0};
        q.add(new Pair(row,col));

        while (!q.isEmpty()){
            int ro=q.peek().first;
            int co=q.peek().second;
            q.poll();

            //traverse the neighbours in 4 the directions and mark them visited
            for(int i=0;i<4;i++){
                int nghrow=ro+switchrow[i];
                int nghcol=co+switchcol[i];
                if(nghrow>=0 && nghrow<r && nghcol>=0 && nghcol<c
                        && grid[nghrow][nghcol]=='1' && visited[nghrow][nghcol]==0){
                        visited[nghrow][nghcol]=1;
                        q.add(new Pair(nghrow,nghcol));
                    }
            }
            
        }
    }
}