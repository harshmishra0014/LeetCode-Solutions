class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer,Integer> d = new HashMap<>();
        d.put(0,-1);
        int convert[]= new int[nums.length];
        int l=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
                convert[i]=1;
            else
                convert[i]=-1;
        }       
        for(int i=1;i<nums.length;i++)
            convert[i]=convert[i]+convert[i-1];
        
        for (int i=0; i<nums.length;i++)
        {
            if (d.containsKey(convert[i]))
                continue;
            else
                d.put(convert[i],i);
        }
        System.out.println(d);
        for (int i =0;i<nums.length;i++)
        {
            l=Math.max(l,i-d.get(convert[i]));
        }
        return l;
    }
}