class Solution {
    public int majorityElement(int[] nums) 
    {
     
        //
        
        int ele=0,count=0;
        for(int a:nums)
        {
            if (count==0)
                ele=a;
            if(ele==a)
                count++;
            else
                count--;
        }
        return ele;
    }
}