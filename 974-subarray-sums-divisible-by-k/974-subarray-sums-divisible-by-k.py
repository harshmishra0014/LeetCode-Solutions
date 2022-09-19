
class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        for i in range(1,len(nums)):
            nums[i]=nums[i]+nums[i-1]
        count=0
        remainder=[i%k for i in nums]
        remainder.insert(0,0)
        d={}
        for i in remainder:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        for i in d:
            if d[i]>1:
                count+=(d[i]*(d[i]-1))//2
        return count