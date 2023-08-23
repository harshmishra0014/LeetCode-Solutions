class Solution {
    public boolean isPerfectSquare(int num) {
        int y = 1;
        while(y <= Integer.MAX_VALUE/y && y *y < num){
            //if(num == y*y)      //overflow
            
            y++;
        }
        if(num % y == 0 &&num / y == y) //no overflow but TLE
                return true;
        return false;
    }
}