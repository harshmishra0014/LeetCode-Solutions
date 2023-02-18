class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int s;
        for(int[] person :accounts){
            s=0;
            for(int money:person){
                s+=money;
            }
            if(s>max)
                max=s;
        }
        return max;
    }
}