class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        d={}
        for i in range(len(nums)):
            d1=nums[i]
            d2=target-nums[i]
            if d2 in d:
                return(i,d[d2])
            else:
                d[d1]=i