class Solution:
    def minSteps(self, s: str, t: str) -> int:
        ds={}
        ls=list(s)
        for i in ls:
            if i not in ds:
                ds[i]=1
            else:
                ds[i]+=1

        dt={}
        lt=list(t)
        for i in lt:
            if i not in dt:
                dt[i]=1
            else:
                dt[i]+=1


        for i in ds:
            if i in dt:
                if ds[i]>=dt[i]:
                    dt[i]=0
                else:
                    dt[i]=dt[i]-ds[i]
        s=0    
        for i in dt:

            s+=dt[i]

        return s