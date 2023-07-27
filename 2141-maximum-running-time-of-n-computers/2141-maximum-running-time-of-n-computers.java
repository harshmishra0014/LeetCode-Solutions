class Solution {
    public boolean canRun(int n, int[] batteries, long mid){
        //check if batteries can supply for mid minutes
        long total = mid * n;
        long duration = 0;
        for(int a : batteries){
            if(a < mid) duration += a;
            else duration += mid;
        }
        return duration >= total;
    }
    public long maxRunTime(int n, int[] batteries) {
        /*i can run the battery minimum for one minute and 
         if there is one computer then maximum of sum minutes
         */
         long low = 0, sum = 0, high, ans = 0;
         for(int a : batteries)
            sum += a;
        high = sum;
        while(low <= high){
            long mid = (low + high)/2;
            //now we will check if every cmputer can run in mid minutes
            if(canRun(n, batteries, mid)){
                ans = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return ans;
    }
}