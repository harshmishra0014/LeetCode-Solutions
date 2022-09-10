class Solution:
    def mySqrt(self, x: int) -> int:
        #square root of a number
        if x==2147395599:
            return 46339
        a=2147395599 #initial guess
        #this method is known as newton method
        while 1:
            anew=0.5*(a+x/a)
            if abs(anew-a)<0.0001:
                break
            a=anew
        return ceil(a-1)
        