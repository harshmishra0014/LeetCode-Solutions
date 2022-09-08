class Solution:
    def containsNearbyAlmostDuplicate(self, nums: List[int], k: int, t: int) -> bool:
        if k<1 or t<0:
            return False
        d={}
        for i,n in enumerate(nums):
            keyvalue=n//(t+1)
            if keyvalue in d:
                return True
            elif (keyvalue-1 in d and abs(n-d[keyvalue-1])<=t):
                return True
            elif (keyvalue+1 in d and abs(n-d[keyvalue+1])<=t):
                return True
            else:
                d[keyvalue]=n
            if (i>=k):
                del d[nums[i-k]//(t+1)]
        return False