class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        int l=2*(int)Math.pow(10,4)+1;
        int s=0;
        int freq[]=new int[l+1];
        for(int i=0;i<=l;i++)
            freq[i]=0;
        for(int i=0;i<nums.length;i++)
            freq[nums[i]+(int)Math.pow(10,4)]+=1;
        for(int i=l-1;i>=0;i--)
        {
            if (freq[i]!=0)
            {
                s+=freq[i];
                if(s>=k)
                    return (int)(i-(int)Math.pow(10,4));
            }
            else
                continue;
        }
        return 0;
    }
}

//using kind of quicksort
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        int low =0, high = n-1;
        while(true){
            int x = partition(nums[low], low + 1, high, nums);
            x--;
            swap(low, x, nums);
            if(x == k-1) return nums[k-1];
            else if(k-1 < x)    high = x-1;
            else    low = x+1;
        }
    }
    public int partition(int pivot, int low, int high, int[] nums){
        int i = low, j = low;
        while(j <= high){
            if(nums[j] <= pivot)    j++;
            else{
                swap(i, j, nums);
                i++;
                j++;
            }
        }
        return i;
    }
    
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}