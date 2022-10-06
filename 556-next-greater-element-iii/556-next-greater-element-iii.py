class Solution:
    def nextGreaterElement(self, n: int) -> int:
        l=list(str(n))
        s=""
        if l==None or len(l)<1:
            return -1
        i=len(l)-2
        while(i>=0 and l[i]>=l[i+1]):
            i-=1
        if(i>=0):
            j=len(l)-1
            while(l[j]<=l[i]):
                j-=1
            l[i],l[j]=l[j],l[i]

            l=l[0:i+1]+l[i+1:][::-1]
            s=s.join(l)
            if int(s)<= 2**31-1:
                return int(s)
            else:
                return -1
        else:    
            return -1
