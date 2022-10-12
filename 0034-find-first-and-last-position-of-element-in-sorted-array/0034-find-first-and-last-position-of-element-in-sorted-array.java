class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] res={-1,-1};
        //to get the first position
        res[0]= binsearch(nums,target,true);
        if(res[0] != -1)
            //to get the last position 
            res[1] = binsearch(nums,target,false);
        return res;
    }
    public int binsearch(int[] nums , int target , boolean flag)
    {
        int start=0;
        int end=nums.length-1;
        int pos=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target < nums[mid])
                end=mid-1;
            else if(target > nums[mid])
                start = mid+1;
            else
            {
                pos=mid;
                //check left side for more values
                if(flag)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return pos;
    }
}