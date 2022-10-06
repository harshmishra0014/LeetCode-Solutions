class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        l=len(nums)
        res=[-1]*l
        nums=nums*2
        st=[-1]
        
        for i in range(2*l):
            while st  and nums[st[-1]]<nums[i]:
                if res[st[-1]%l] == -1:
                    res[st[-1]%l] = nums[i]
                st.pop()
            st.append(i)
        
        return res