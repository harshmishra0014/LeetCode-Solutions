class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i : weights){
            sum += i;
            max = Math.max(max, i);
        }

        int low = max, high = sum;
        while(low <= high){
            int mid = (low + high)/2;
            if(numberOfDays(weights, mid) <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    private static int numberOfDays(int[] weights, int capacity) {
        int days = 1, loads = 0;
        for(int i : weights){
            if(loads + i > capacity) {
                days += 1;
                loads = i;
            }
            else
                loads += i;
        }
        return days;
    }
}