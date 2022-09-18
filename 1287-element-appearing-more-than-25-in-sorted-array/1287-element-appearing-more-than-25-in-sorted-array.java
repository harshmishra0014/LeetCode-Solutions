class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int ma=arr.length/4;
        int c=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                c++;
                if(c>ma)
                    return arr[i];
            }
            else
                c=1;
        }
        return arr[0];
    }
}