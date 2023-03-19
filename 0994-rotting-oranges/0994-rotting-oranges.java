class PairTime {
    int row,col,time;
    PairTime(int a, int b, int c){
        this.row=a;
        this.col=b;
        this.time=c;
    }
}
class Solution {
    public  int orangesRotting(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        Queue<PairTime> q = new LinkedList<PairTime>();
        int[][] visited=new int[m][n];

        int countfresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2) {
                    visited[i][j] = 2;
                    q.offer(new PairTime(i, j, 0));             // pushing all the initially rotten oranges in the queue.
                }
                else
                    visited[i][j]=0;

                if(grid[i][j]==1)   countfresh++;               //keeping count of all fresh oranges.
            }
        }
        int tm=0;
        int[] delrow={-1,0,+1,0};       // both array for neighbouring
        int[] delcol={0,1,0,-1};
        int cnt=0;              // for counting number of oranges getting rotten
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            q.poll();
            tm=Math.max(tm,t);      //taking max time
            for(int i=0;i<4;i++){
                int nrow=r+delrow[i];
                int ncol=c+delcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n &&
                visited[nrow][ncol]!=2 && grid[nrow][ncol]==1) {
                    visited[nrow][ncol] = 2;
                    q.offer(new PairTime(nrow, ncol, t + 1));       //for next level(set) of oranges
                    cnt++;
                }
            }
        }
        if(cnt!=countfresh) return  -1;
        return tm;
    }
}