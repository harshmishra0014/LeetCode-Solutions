class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[]     #for result array
       
        n=len(nums)
        lprod=[]
        rprod=[]
        lprod.append(nums[0])
        rprod.append(nums[n-1])
        # creating prefix product list
        for i in range(1,n):
            lprod.append(nums[i]*lprod[i-1])
        j=0   
        for i in range(n-2,-1,-1):            
            rprod.append(nums[i]*rprod[j])
            j+=1
            
        for i in range(n):
            if nums[i]==0:
                left=lprod[n-1]
                right=rprod[n-1]
            if i==0:    #first element
                left=1
                right=rprod[n-2]
            elif i==n-1:    #last element
                right=1
                left=lprod[n-2]
            else:
                left=lprod[i-1]
                right=rprod[n-i-2]
            res.append(left*right)
        
        return res