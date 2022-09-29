class Solution 
{
    public int arraySign(int[] nums) 
    {
        double prod=1;
        for(int a:nums)
        {
            prod*=a;
        }
        return signFunc(prod);
    }
    public int signFunc(double prod)
    {
        if (prod>0)
            return 1;
        else if(prod<0)
            return -1;
        else
            return 0;
    }
}