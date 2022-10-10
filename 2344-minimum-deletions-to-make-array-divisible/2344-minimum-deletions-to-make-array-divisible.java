class Solution {
    public int minOperations(int[] nums, int[] numsDivide) 
    {
        int g=gcdarray(numsDivide);
        //System.out.println(g);
        int c=0;
        Arrays.sort(nums);
        for(int i:nums)
        {
            if (g%i==0)
                return c;
            else
                c++;
        }
        return -1;
        
    }
    public int gcdarray(int a[])
    {
        int result=a[0];
        for(int i:a)
        {
            result=gcd(result,i);
            if (result==1)
                return 1;
        }
        return result;
    }
    public int gcd(int a,int b)
    {
        if (a==0)
            return b;
        return gcd(b%a,a);
    }
}