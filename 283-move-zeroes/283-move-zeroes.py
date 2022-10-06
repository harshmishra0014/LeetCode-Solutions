class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c= 0
        for i in range(len(nums)):
            if nums[c]== 0:
                nums.pop(c)
                nums.append(0)
            else:
                c+=1