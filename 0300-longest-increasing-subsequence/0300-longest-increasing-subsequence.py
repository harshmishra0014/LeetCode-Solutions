class Solution:
    def lengthOfLIS(self, arr: List[int]) -> int:
        n=len(arr)
        dp=[1]*n
        for i in range(1,n):
            for j in range(i):
                if arr[j]<arr[i]:
                    dp[i]=max(1+dp[j],dp[i])
        return max(dp)