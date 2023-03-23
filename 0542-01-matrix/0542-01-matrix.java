class PairDistance{
    int row,col,dist;
    PairDistance(int a, int b, int c){
        this.row=a;
        this.col=b;
        this.dist=c;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] visited= new int[m][n];
        int[][] result=new int[m][n];

        Queue<PairDistance> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.offer(new PairDistance(i,j,0));     //adding all the initial '1' to the queue
                    visited[i][j]=1;
                }
                else{
                    visited[i][j]=0;
                }
            }
        }
        int[] delrow={-1,0,+1,0};
        int[] delcol={0,+1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int s=q.peek().dist;
            q.poll();
            result[r][c]=s;
            for(int i=0;i<4;i++){
                int nr=r+delrow[i];
                int nc=c+delcol[i];
                if(nr>=0 && nr<m && nc>=0 && nc<n && visited[nr][nc]!=1){
                    visited[nr][nc]=1;
                    q.offer(new PairDistance(nr,nc,s+1));
                }
            }
        }
        return result;
    }
}