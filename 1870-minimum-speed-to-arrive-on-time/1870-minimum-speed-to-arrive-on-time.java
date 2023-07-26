class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int lowspeed=0, highspeed=10000000+1;
        while(lowspeed <= highspeed){
            int mid = (lowspeed + highspeed)/2;
            double totaltime=0;
            for(int d : dist){
                totaltime = Math.ceil(totaltime);
                totaltime += ((double)(d))/((double)(mid));
            }
            if(totaltime > hour){
                lowspeed = mid+1;
            }
            else
                highspeed = mid-1;
        }
        return lowspeed>10000000?-1:lowspeed;
    }
}