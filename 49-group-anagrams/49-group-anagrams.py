class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d={}
        res=[]
        for i in strs:
            mask=[0]*26
            for j in i:
                mask[ord(j)-97]+=1
            mask=str(mask)
            if mask not in d:
                d[mask]=[i]
            else:
                d[mask].append(i)
        
        for i in d:
            res.append(d[i])
        return res