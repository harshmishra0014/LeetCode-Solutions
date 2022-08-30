class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        s=set()
        for j in range(len(nums)): 
            d={}
            for i in range(j+1,len(nums)):
                d2=-(nums[i]+nums[j])
                if d2 in d:
                    x=[nums[i],nums[j],d2]
                    x.sort()
                    s.add(tuple(x))
                else:    
                    d[nums[i]]=1
        return(s)