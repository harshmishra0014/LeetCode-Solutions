class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length();
        int c=0;
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                c++;
            }
            else
            {   
                if (c==0)
                    continue;
                else
                    break;
            }
        }
        return c;
    }
}