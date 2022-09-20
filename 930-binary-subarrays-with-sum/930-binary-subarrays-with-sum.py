class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
        d=dict()
        totalsum=0
        ans=0
        d[0]=1
        for i in nums:
            totalsum+=i
            if totalsum-goal in d:
                ans+=d[totalsum-goal]
            
            #adding prefix sum
            if totalsum in d:
                d[totalsum]+=1
            else:
                
                d[totalsum]=1
        return ans