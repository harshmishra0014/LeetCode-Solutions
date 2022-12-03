class Solution:
    def frequencySort(self, s: str) -> str:        
        d={}       
        for i in range(len(s)):
            if s[i] in d:
                d[s[i]]+=1
            else:
                d[s[i]]=1
        l=sorted(d.items(), key=lambda kv:kv[1],reverse=True)
        ans=[i[0]*i[1] for i in l]
        ans="".join(ans)
        return ans