class Solution {
    public int lengthOfLastWord(String s) {
        s=s+" ";
        String w="";
        int ll=0;
        int l=s.length();
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {   if (w.length()!=0)
                    ll=w.length();
                w="";
            }
        }
        return ll;
        
    }
}