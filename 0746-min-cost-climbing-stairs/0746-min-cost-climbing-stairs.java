class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length+1];
        for(int i=2;i<=cost.length;i++){
            int s=dp[i-1]+cost[i-1];
            int d=dp[i-2]+cost[i-2];
            dp[i]=Math.min(s,d);
        }
        return dp[cost.length];
    }
}