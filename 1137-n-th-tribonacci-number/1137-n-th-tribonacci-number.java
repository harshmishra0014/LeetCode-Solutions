class Solution
{
    public int tribonacci(int n) {
        int first = 0, second = 1, third = 1, res = 0;
        if(n==0) return first;
        else if(n==1) return second;
        else if(n==2) return third;
        for(int i=3;i<=n;i++){
            res = first+second+third;
            first = second; second = third; third = res;
        }
        return res;
    }
}