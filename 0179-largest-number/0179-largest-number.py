class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        a=[str(s) for s in nums]
        for i in range(len(a)-1):
            for j in range(i+1,len(a)):
                if int(a[i]+a[j])<int(a[j]+a[i]):
                    a[i],a[j]=a[j],a[i]

        return str(int("".join(a)))