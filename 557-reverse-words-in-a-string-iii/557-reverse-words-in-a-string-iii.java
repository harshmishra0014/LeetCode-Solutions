class Solution {
    public static String reverseWords(String s) {
        s=s.trim();
        s=s+" ";
        int wl,l=s.length();
        String ss="",w="";
        for(int i=0;i<l;i++)
        {
            if (s.charAt(i)!=' ')
                w=w+s.charAt(i);
            else
            {
                
                wl=w.length();
                
                for(int j=wl-1;j>=0;j--)
                    ss+=w.charAt(j);
                ss+=" "; 
                w="";
            }
        }
        return ss.trim();
    }
}