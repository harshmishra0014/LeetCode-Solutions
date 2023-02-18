class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int  i: nums)
        {
            if(even(i))
                c++;
        }
        return c;
    }
    boolean even(int n){
        if(digits(n)%2==0)
            return true;
        else
            return false;
    }
    int digits(int n){
        if(n<0)
            n*=-1;
        
        return (int)Math.log10(n)+1;
    }
}