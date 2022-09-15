class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        freq=[0]*(2*(10**4)+1)
        s=0
        for i in nums:
            freq[i+10**4]+=1
        for i in range(len(freq)-1,0,-1):
            if freq[i]!=0:
                s+=freq[i]
                if s>=k:
                    return (i-10**4)
            else:
                continue
            
                
        