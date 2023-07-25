class Solution1 {
    public int peakIndexInMountainArray(int[] arr) {
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i] < arr[i+1])
                continue;
            else
                return i;
        }
        return i;
    }
}

//using binary search
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, h = arr.length, mid;
        while(l < h){
            mid = (l + h)/2;
            if(arr[mid] < arr[mid + 1])
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }
}