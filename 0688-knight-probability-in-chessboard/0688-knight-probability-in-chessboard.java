class Solution {
    public boolean inBoard(int ni, int nj, int n){
        if(ni>=0 && nj>=0 && ni<n && nj<n)
            return true;
        else
            return false;
    }
    public double knightProbability(int n, int k, int row, int column) {
        double[][] current = new double[n][n];      //dp table representing current state
        double[][] next = new double[n][n];         //dp table representing next state
        //directions for movement of knight
        int x[] = {1,1,-1,-1,2,2,-2,-2};
        int y[] = {2,-2,2,-2,1,-1,1,-1};
        current[row][column]=1;         //initially knight is placed at
        //loop for number of moves
        for(int moves=0;moves<k;moves++){
            //iterating in current matrix
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(current[i][j]!=0){
                        for(int dir=0;dir<8;dir++){
                            int ni=i+x[dir];
                            int nj=j+y[dir];
                            if(inBoard(ni, nj, n)){
                                next[ni][nj] += current[i][j]/8.0;
                            }
                        }
                    }
                }
            }
            current = next;
            next = new double[n][n];
        }
        double sum=0;
        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum+=current[i][j];
                }
        }
        return sum;
    }
}