class Solution:
    def hIndex(self, citations: List[int]) -> int:
        c=0      #h index
        citations.sort(reverse=True)
        for i in citations:
            c+=1
            if i < c:
                return c-1
        return c