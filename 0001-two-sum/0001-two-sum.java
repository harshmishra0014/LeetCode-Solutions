//brute 
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j)
                    continue;
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
//better
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            int more = target - val;
            if(map.containsKey(more)){
                ans[0] = map.get(more);
                ans[1] = i;
                return ans;
            }
            map.put(val, i);
        }
        return ans;
    }
}

