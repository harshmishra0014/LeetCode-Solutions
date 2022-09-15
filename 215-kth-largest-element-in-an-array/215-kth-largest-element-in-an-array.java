class Solution {
    public int findKthLargest(int[] nums, int k) {
        int l=2*(int)Math.pow(10,4)+1;
        int s=0;
        int freq[]=new int[l+1];
        for(int i=0;i<=l;i++)
            freq[i]=0;
        for(int i=0;i<nums.length;i++)
            freq[nums[i]+(int)Math.pow(10,4)]+=1;
        for(int i=l-1;i>=0;i--)
        {
            if (freq[i]!=0)
            {
                s+=freq[i];
                if(s>=k)
                    return (int)(i-(int)Math.pow(10,4));
            }
            else
                continue;
        }
        return 0;
    }
}