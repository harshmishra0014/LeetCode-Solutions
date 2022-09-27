class Solution {
    public int[] plusOne(int[] digits) 
    {
        for(int i = digits.length-1; i>=0; i--)
        {
            if(digits[i]<9)    //checking normal elements and incrementing and returning them
            { 
                digits[i]++;
                return digits;
            }
            digits[i] = 0;   //if a element with last 9 is there assigning 9 as 0 then incrementing following value and returning 
        }
        
        //in case all are 9 then digits array would be all 0
        // a preceeding carry of 1 can be added 
        int [] list = new int[digits.length+1];   
        
        list[0] = 1;  //case of all 9
        
        return list;
    }
}