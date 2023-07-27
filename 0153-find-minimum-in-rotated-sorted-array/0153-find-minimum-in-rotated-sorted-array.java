class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            /*
            if our entire left or right portion is sorted then the smallest element would be at low index, so we don't need to partition it again
             */
            if(nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }

            //check if left part is sorted
            if(nums[low] <= nums[mid]){
                //store minimum from left part
                ans = Math.min(ans, nums[low]);
                //eliminate left part
                low = mid+1;
            }
            //right part is sorted
            else{
                //store minimum from right part
                ans = Math.min(ans, nums[mid]);
                //eliminate right part
                high = mid-1;
            }
        }
        return ans;
    }
}