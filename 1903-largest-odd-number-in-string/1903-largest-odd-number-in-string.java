class Solution {
    public String largestOddNumber(String num) 
    {
        String ans="";
        char ch;
        for(int i=num.length()-1;i>=0;i--)
        {
            ch=num.charAt(i);
            if(Character.getNumericValue(ch)%2!=0)
            {
                ans=num.substring(0,i+1);
                break;
            }
        }
        return ans;        
    }
}