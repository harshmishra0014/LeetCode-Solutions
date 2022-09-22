class Solution:
    def reverseWords(self, s: str) -> str:
        
        ss=""   
        
        
        ss=" ".join(s.split()[::-1])[::-1]
        return ss
    