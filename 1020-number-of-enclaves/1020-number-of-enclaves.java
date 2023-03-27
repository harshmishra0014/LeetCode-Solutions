class Pair{
    int ro,co;
    Pair(int a,int b){
        this.ro=a;
        this.co=b;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        Queue<Pair> q=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                //first row, first col, last row, last col i.e. boundary elements
                if(i==0 || j==0 || i==m-1 || j==n-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=true;
                    }
                }
            }
        }
        int[] delrow={-1,0,+1,0};
        int[] delcol={0,1,0,-1};
        
        
        while(!q.isEmpty()){
            int row=q.peek().ro;
            int col=q.peek().co;
            q.poll();
            
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n &&!vis[nrow][ncol] && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=true;
                }
            }
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    c++;
                }
            }
        }
        return c;
    }
}