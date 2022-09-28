class Solution {
    public double average(int[] salary) 
    {
        int max=1000;
        int min=1000000;
        double sum=0,l=salary.length;
        for (int a:salary)
        {
            sum=sum+a;
            max=Math.max(max,a);
            min=Math.min(min,a);
        }
        
        return (sum-max-min)/(l-2);
    }
}