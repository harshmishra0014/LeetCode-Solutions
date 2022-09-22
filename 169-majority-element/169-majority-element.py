class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        #using hashmap but space is O(n)
        d={}
        if len(nums)==1:
            return nums[0]
        for i in nums:
            if i in d and d[i]==len(nums)//2:                
                return i
            if i in d:                
                d[i]+=1
            else:                
                d[i]=1