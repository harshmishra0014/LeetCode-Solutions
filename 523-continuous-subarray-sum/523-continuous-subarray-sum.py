class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        
        #prefix sum
        for i in range(1,len(nums)):
            nums[i]=nums[i]+nums[i-1]

        #finding remainder
        remainder=[i%k for i in nums]

        #value with sum zero has index -1
        d={0:-1}

        #storing first frequency of remainder in dictionary
        for i in range(len(remainder)):
            if  remainder[i] not in d:
                d[remainder[i]]=i
        
        
        for i in range(len(remainder)):
            if remainder[i] in d:
                if i - d[remainder[i]] > 1:
                    return True
        return False