class Solution:
    def minSubArrayLen(self, k: int, nums: List[int]) -> int:
        i=0
        sum=0
        st=0
        m=sys.maxsize
        while(i<len(nums)):
            sum+=nums[i]
            while sum>=k:
                m=min(m,i-st+1)
                sum-=nums[st]
                st+=1
            i+=1
        return 0 if m==sys.maxsize else m