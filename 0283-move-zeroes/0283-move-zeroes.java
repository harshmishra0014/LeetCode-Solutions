class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> a= new ArrayList<Integer>();
        for(int i:nums){
            if(i!=0)
                a.add(i);
        }
        for(int i=0;i<a.size();i++)
            nums[i]=a.get(i);
        for(int i=a.size();i<nums.length;i++)
            nums[i]=0;
    }
}