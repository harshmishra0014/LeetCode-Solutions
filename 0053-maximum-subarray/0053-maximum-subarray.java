class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=nums[0];
        for(int a: nums)
        {
            sum+=a;
            if(sum>maxsum)
                maxsum=sum;
            if(sum<0)
                sum=0;
        }
        return maxsum;
        
    }
}