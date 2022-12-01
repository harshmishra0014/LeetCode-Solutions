class Solution {
    public boolean halvesAreAlike(String s) 
    {
        int start=0;
        int end=s.length()-1;
        int c=0;
        String vowel="aeiouAEIOU";
        while (start<end)
        {
            if(vowel.indexOf(s.charAt(start))!=-1)
                c++;
            if(vowel.indexOf(s.charAt(end))!=-1)
                c--;     
            start++;end--;
        }
        return (c==0)?true:false;
    }
}