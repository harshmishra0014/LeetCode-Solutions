/*
brute approach would be to check left and right of each element
 */
/*
BINARY SEARCH APPROACH:
idea is to get the mid value and check if it is peak or not
it will be peak if arr[mid - 1] < arr[mid] > arr[mid +1]
if mid is not peak we will try to locate that half in which the peak would be
if arr[mid] is following an increasing(arr[i-1] < arr[mid]) trend then we can say that peak will be on right side
if arr[mid] is following a decreasing(arr[i-1] > arr[mid]) trend then we can say that peak will be on left side
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        if(nums.length == 1)    //only one element
            return 0;
        /*
        in order to avoid multiple edge cases we can separately check the first and last element if they are peak or not
         */
        if(nums[0] > nums[1])   //first element is peak
            return 0;
        if(nums[l - 1] > nums[l - 2])   //first element is peak
            return l - 1;
        int low = 1, high = nums.length - 2;
        while(low <= high){
            int mid = (low + high)/2;
            //check if mid is peak
            if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1])
                return mid;
            //if mid is in increasing
            else if(nums[mid - 1] < nums[mid])
                low = mid + 1;
            //in decreasing
            else if(nums[mid - 1] > nums[mid])
                high = mid - 1;
            else        //if in valley then peak can be either side
                low = mid + 1;
        }
        return -1;
    }
}