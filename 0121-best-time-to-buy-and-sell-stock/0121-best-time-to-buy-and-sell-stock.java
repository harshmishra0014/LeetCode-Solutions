class Solution {
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int a: nums)
        {
            if(a<min)
                min=a;
            else if(a-min > profit)
                profit=a-min;
        }
        return profit;
    }
}