class Solution {
    public boolean isPalindrome(int x) 
    {
        int r1;
        int n=0;
        int temp=x;
        while (temp>0)
        {
            r1=temp%10;
            n=n*10+r1;
            temp=temp/10;
        }
        if (x==n)
            return true;
        else
            return false;
    }
}