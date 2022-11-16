import heapq
class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n=len(nums)
        h=[]
        res=[]
        for i in range(k):
            heapq.heappush(h,(-nums[i],i))
        i=0
        j=k-1
        while(j<n):
            if(h[0][1]>=i and h[0][1]<=j):
                res.append(-h[0][0])
                i+=1
                j+=1
                if(j<n):
                    heapq.heappush(h,(-nums[j],j))
            else:
                heapq.heappop(h)
        return res
        