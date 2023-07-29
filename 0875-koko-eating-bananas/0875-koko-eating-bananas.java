class Solution {
    public int max(int[] piles){
        /*
        finding max element in array to decide range
        */
        int max = Integer.MIN_VALUE;
        for(int i : piles)
            max = Math.max(max, i);
        return max;
    }
    public int totalHours(int[] piles, int perHour){
        /*
        total time taken at a per hour eating rate
        */
        int totaltime=0;
        for(int i : piles)
            totaltime += Math.ceil((double)i/(double)perHour);
        return totaltime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = max(piles);       
        while(low <= high){
            int mid = (low + high)/2;
            if(totalHours(piles, mid) <= h){
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return low;
    }
}