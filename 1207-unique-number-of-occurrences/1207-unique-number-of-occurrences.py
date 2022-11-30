class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        d={}
        for i in arr:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        s=set()
        for i in d.values():
            s.add(i)
        
        if len(s)==len(d):
            return True
        else:
            return False