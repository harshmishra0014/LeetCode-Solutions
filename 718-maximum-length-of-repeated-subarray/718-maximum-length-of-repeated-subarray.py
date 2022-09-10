class Solution:
    def findLength(self, nums1: List[int], nums2: List[int]) -> int:
        csa=[]
        ans=0
        def find(subarr) ->bool:
            for i in range(0,len(nums2)-len(subarr)+1):
                if nums2[i]==subarr[0]:
                    if subarr==nums2[i:i+len(subarr)]:
                        return True
            return False
        for i in nums1:
            csa.append(i)
            if find(csa):
                ans=max(ans,len(csa))
            else:
                csa=csa[1:]
        return ans