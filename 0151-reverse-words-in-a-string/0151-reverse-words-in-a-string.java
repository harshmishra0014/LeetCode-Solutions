class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        int start=0;
        int last = s.length()-1;
        String ans="";
        String temp="";
        while(start<=last)
        {
            if(s.charAt(start)==' ')
            {
                if(temp.length()!=0)
                {
                    if(ans.equals(""))
                        ans=ans+temp;
                    else
                        ans=temp+" "+ans;
                }
                temp="";
            }
            else
                temp=temp+s.charAt(start);
            start++;
        }
        ans=ans.trim();
        return  ans;
    }
}