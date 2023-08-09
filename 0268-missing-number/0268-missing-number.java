class Solution4 {
    public int missingNumber(int[] nums) 
    {
        int i=0;
        while(i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //search for first missing number
        for(int index=0;index< nums.length;index++) {
            if (nums[index] != index)
                return index;
        }
        return nums.length;
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
//brute
class Solution1 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            int flag = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    flag = 1;
                }
            }
            if(flag == 0)
                return i;
        }
        return -1;
    }
}
//better
class Solution2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] hash = new  int[n + 1];
        Arrays.fill(hash, 0);
        for(int i : nums)
            hash[i]++;
        for(int i = 0; i < hash.length; i++){
            if (hash[i] == 0)
                return i;
        }
        return -1;
    }
}

//optimal1 using logic of sum of first n natural number
class Solution3 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1)/2;            //sum of first n natural numbers

        int sum2 = 0;
        for(int i : nums)
            sum2 += i;
        return sum-sum2;
    }
}

//optimal 2 using xor
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < n; i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i+1);
        }
        return xor1 ^ xor2;
    }
}