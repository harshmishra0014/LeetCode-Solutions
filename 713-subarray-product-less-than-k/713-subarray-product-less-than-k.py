class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        i=0
        st=0
        mul=1
        total=0
        if k<=1:
            return 0
        while(i<len(nums)):
            mul*=nums[i]
            while(mul>=k):
                mul/=nums[st]
                st+=1
            total+=i-st+1
            i+=1
        return total