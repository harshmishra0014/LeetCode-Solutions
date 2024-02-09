/*
Recursive approach
O(n^2)
*/
class Solution1 {
    Map<Integer, List<Integer>> endingSubset;       //to store largest subset at respective indices
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if(n == 0)  return new ArrayList<>();
        
        this.endingSubset = new HashMap<>();
        Arrays.sort(nums);      //to follow only one order
        
        List<Integer> maxSubset = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> subset = findSubsetEndingAtNum(i, nums);
            if(maxSubset.size() < subset.size()){
                maxSubset = subset;
            }
        }
        return maxSubset;
    }
    
    private List<Integer> findSubsetEndingAtNum(int i,int[] nums){
        if(endingSubset.containsKey(i)){
            return endingSubset.get(i);
        }
        
        List<Integer> localMaxSubset = new ArrayList<>();
        for(int k = 0; k < i; k++){
            if(nums[i] % nums[k] == 0){
                List<Integer> subset = findSubsetEndingAtNum(k, nums);
                if(localMaxSubset.size() < subset.size()){
                    localMaxSubset = subset;
                }
            }
        }
        List<Integer> newSubset = new ArrayList<>();
        newSubset.addAll(localMaxSubset);
        newSubset.add(nums[i]);
        
        endingSubset.put(i, newSubset);
        return newSubset;
    }
}

/*
iterative dp
*/
class Solution {
    Map<Integer, List<Integer>> endingSubset;       //to store largest subset at respective indices
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if(n == 0)  return new ArrayList<>();
        
        this.endingSubset = new HashMap<>();
        for(int i = 0; i < n; i++){
            this.endingSubset.put(i, new ArrayList<>());
        }
        
        Arrays.sort(nums);      //to follow only one order
        
        List<Integer> maxSubset = new ArrayList<>();
        for(int i = 0; i < n; i++){   
            List<Integer> localMaxSubset = new ArrayList<>();
            for(int k = 0; k < i; k++){
                if(nums[i] % nums[k] == 0){
                    List<Integer> subset = endingSubset.get(k);
                    if(localMaxSubset.size() < subset.size()){
                        localMaxSubset = subset;
                    }
                }
            }
            endingSubset.get(i).addAll(localMaxSubset);
            endingSubset.get(i).add(nums[i]);
        }
        for(int i = 0; i < n; i++){
            if(maxSubset.size() < endingSubset.get(i).size()){
                maxSubset = endingSubset.get(i);
            }
        }
        return maxSubset;
    }
    
}