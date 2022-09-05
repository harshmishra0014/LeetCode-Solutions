class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        f=[0]*60
        c=0
       
        #storing frequencies of remainder
        for i in time:
            f[i%60]+=1
        
        #condition for pairin of numbers with 0 as remainder
        if f[0]>1:
            c=(f[0]*(f[0]-1))//2
        
        # condition for half of number
        if f[30]>1:
            c+=(f[30]*(f[30]-1))//2
        i=1
        j=59
        while(i<j):
            c+=f[i]*f[j]
            i+=1
            j-=1
        return c