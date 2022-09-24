class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int start=0;
        int last=l-1;
        char c;
        while(start<last)
        {
            c=s[start];
            s[start]=s[last];
            s[last]=c;
            start++;last--;
        }
        
        
    }
}