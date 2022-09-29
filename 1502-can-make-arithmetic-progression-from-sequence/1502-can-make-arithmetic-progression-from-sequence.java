class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        int cd=arr[1]-arr[0];
        int flag=0;
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==cd)          
                flag=1;
            else
            {
                flag=0;
                break;
            }
        }
        if (flag==1)
            return true;
        else
            return false;
    }
}