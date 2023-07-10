//TC O(n+k) SC:O(k)
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if (n==0)
            return;
        k=k%n;
        int[] temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=nums[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
          nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
          nums[i] = temp[i];
        }
    }
}

//constant space
class Solution1 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // Reverse first n-k elements
        Reverse(nums, 0, n - k - 1);
        // Reverse last k elements
        Reverse(nums, n - k, n - 1);
        // Reverse whole array
        Reverse(nums, 0, n - 1);
        }
    // Function to Reverse the array
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
    }
}
