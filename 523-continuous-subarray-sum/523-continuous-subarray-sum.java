class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> d=new HashMap<>();
        
        // prefix sum array
        for(int i=1;i<nums.length;i++)
            nums[i]=nums[i]+nums[i-1];
        
        // array having remainder of prefix sum
        for(int i=0; i<nums.length;i++)
            nums[i]=nums[i]%k;
        
        d.put(0,-1);
        // storing first occurence of remainder in dict.
        for (int i=0;i<nums.length;i++)
        {
            if(d.containsKey(nums[i]))
                continue;
            else
                d.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++)
        {
            if (d.containsKey(nums[i]))
                if (i-d.get(nums[i])>1)
                    return true;
        }
        return false;
    }
}