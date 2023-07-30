/*
        the idea of brute force approach is that if any number less than k is present it means it has taken its place
        eg: 5, 7 10 12  k=4
        in case of 4 no number is less than k means nobody has taken place so 4 will be answer
        k=6
        in case of 6 5 has occurred which means now 6th element would be k+1 i.e 7
         */
class Solution {
    public int findKthPositive(int[] arr, int k) {
        /*
        in an ideal case a[i] = i+1 i.e at 0th index there should be 1 at 1st index there should be 2
        we will use this to identify that how many numbers are missing at a particular index
        now we can easily go to the kth index using BS once we know the neighbours of kth index we can easily find the number
         */
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            //how many numbers are missing at this position
            int missing = arr[mid] - (mid  + 1);   //what is present - what should be present
            if(missing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        /*
        now high is pointing at index from where numbers are missing
        so we have to find how many more numbers are missing

        k - missing number => k - (arr[high] - (high+1))

        ans = arr[high] + more => arr[high] + k - missing number =>arr[high]+ k - (arr[high] - (high+1))
        ans = arr[high] + k - arr[high] + high + 1
        ans = high + 1 + k
        ans = low + k
         */
        return low + k;
    }
}