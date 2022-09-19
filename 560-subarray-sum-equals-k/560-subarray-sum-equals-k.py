class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        for i in range(1,len(nums)):
            nums[i]=nums[i]+nums[i-1]
        d={0:1}
        count=0
        for i in nums:
            extra=i-k
            if extra in d:
                count+=d[extra]
                
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        return count