class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        res=[]
        prefix_sum=[]
        prefix_sum.append(nums[0])
        n=len(nums)
        for i in range(1,len(nums)):
            prefix_sum.append(nums[i]+prefix_sum[i-1])
        
        for i in range(len(nums)):
            if i==0:
                left=0
                right= (prefix_sum[len(nums)-1]-nums[i]) - (nums[i]*(n-1-i))
            elif i==(n-1):
                right=0
                left=(nums[i]*i) - (prefix_sum[i-1])
            else:
                left= (nums[i]*i) - (prefix_sum[i-1])
                right= (prefix_sum[n-1]-prefix_sum[i]) - (nums[i]*(n-1-i))
                
            res.append(left+right)
        return res