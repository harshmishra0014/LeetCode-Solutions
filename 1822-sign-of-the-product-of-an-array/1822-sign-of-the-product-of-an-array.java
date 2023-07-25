//taking product and checkin gits sign
class Solution1 
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

class Solution {
    public int arraySign(int[] nums) {
        int sign=1;
        for(int i : nums){
            if(i == 0)
                return 0;
            if(i < 0)
                sign *= -1;
        }
        return sign;
    }
}