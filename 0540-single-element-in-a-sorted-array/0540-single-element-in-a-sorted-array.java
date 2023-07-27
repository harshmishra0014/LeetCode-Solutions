class Solution1 {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==nums[mid^1])
                low=mid+1;
            else
                high=mid-1;
        }
        return nums[low];
    }
}

class Solution {
    /*
    initially the numbers follow a (even, odd) trend that is first occurrence is at odd  index and second at even index
    as soon as a single element is encountered this trend changes to (odd, even)
     */
    public int singleNonDuplicate(int[] nums) {
        int l = nums.length;
        if(l == 1)              // if only one element is present
            return nums[0];
        /*
        checking for edge cases
         */
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[l-1] != nums[l-2])
            return nums[l-1];

        int low = 1, high = l-2;
        while(low <= high){
            int mid = (low + high)/2;
            //if middle element is not equal to either of its side it means that it is the single element
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
                return nums[mid];
            //checking if element is on right side i.e. we are on left side
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 ==1 && nums[mid] == nums[mid - 1]))
                low = mid + 1;
            else
                high = mid -1;      //element on left side
        }
        return -1;
    }
}