class Solution {
    public boolean isHappy(int n) 
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s+=r*r;
            n=n/10;
            if (n==0 && s>9)
            {    n=s; s=0;  }
            
        }
        if (s==1 || s==7)
            return true;
        else
            return false;
    }
}