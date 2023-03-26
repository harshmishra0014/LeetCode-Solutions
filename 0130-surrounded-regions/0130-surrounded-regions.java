class Solution{
    int[] delrow={-1,0,+1,0};
    int[] delcol={0,1,0,-1};
    void dfs(int row,int col,boolean[][] vis,char[][] a){
        vis[row][col]=true;
        int m=a.length;
        int n=a[0].length;
        //check for four direction
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n &&!vis[nrow][ncol] && a[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,a);
            }
        }
    }
    public void solve(char[][] a) {
        int m=a.length;
        int n=a[0].length;
        boolean[][] vis=new boolean[m][n];
        
        //traversing first row and last row
        for(int i=0;i<n;i++){
            //first row
            if(!vis[0][i] && a[0][i]=='O'){
                dfs(0,i,vis,a);
            }
            
            //last row
            if(!vis[m-1][i] && a[m-1][i]=='O'){
                dfs(m-1,i,vis,a);    
            }
        }
        
        //traversing first column and last column
        for(int i=0;i<m;i++){
            //first row
            if(!vis[i][0] && a[i][0]=='O'){
                dfs(i,0,vis,a);
            }
            
            //last row
            if(!vis[i][n-1] && a[i][n-1]=='O'){
                dfs(i,n-1,vis,a);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && a[i][j]=='O'){
                    a[i][j]='X';
                }
            }
        }
    }
}