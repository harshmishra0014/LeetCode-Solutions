class Solution1 {
    public int numSquares(int n) {
        
        return solve(n);
    }
    private int solve(int n){
        
        if(n <= 1)  return n;   //base case
        int count = Integer.MAX_VALUE;
        for(int i = 1; i <= Math.sqrt(n); i++){
            int temp = 1 + solve(n - (i * i));
            count = Math.min(count, temp);
        }
        
        return count;
    }
}

class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    private int solve(int n, int[] dp){
        
        if(n <= 1)  return n;   //base case
        if (dp[n] != -1)    return dp[n];
        int count = Integer.MAX_VALUE;
        for(int i = 1; i <= Math.sqrt(n); i++){
            int temp = 1 + solve(n - (i * i), dp);
            count = Math.min(count, temp);
        }
        
        return dp[n] = count;
    }
}