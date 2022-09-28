class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            prod*=r;
            sum+=r;
            n=n/10;
        }
        return (prod-sum);
    }
}