class Solution {
    public void sortColors(int[] nums) 
    {
        int[] freq={0,0,0};
        for(int a:nums)
            freq[a]++;         
        for(int i=0;i<nums.length;i++)
        {
            if(freq[0]-->0)
                nums[i]=0;
            else if(freq[1]-->0)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
}