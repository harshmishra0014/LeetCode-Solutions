class Solution {
    public int missingNumber(int[] nums) 
    {
        int i=0;
        while(i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //search for first missing number
        for(int index=0;index< nums.length;index++) {
            if (nums[index] != index)
                return index;
        }
        return nums.length;
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}