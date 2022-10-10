class Solution:
    def minOperations(self, nums: List[int], numsDivide: List[int]) -> int:
        g=numsDivide[0]
        c=0
        for i in numsDivide:
            g=math.gcd(g,i)
        
        nums.sort()
        for i in nums:
            if g%i==0:
                return c;
            else:
                c+=1
        
        return -1
    