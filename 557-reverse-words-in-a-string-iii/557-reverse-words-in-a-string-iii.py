class Solution:
    def reverseWords(self, s: str) -> str:
        l=list(s.split())
        ss=""   
        for i in l:
            i=i[::-1]
            ss+=i+" "            
        return ss.rstrip()