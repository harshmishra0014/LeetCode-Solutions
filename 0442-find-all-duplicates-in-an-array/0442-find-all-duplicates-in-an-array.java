class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans=new ArrayList<Integer>();
        while(i< nums.length){
            int correct=nums[i]-1;
            if (nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(i=0;i< nums.length;i++){
            if(nums[i] != i+1)
                ans.add(nums[i]);
        }
        return ans;
    }
    void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}