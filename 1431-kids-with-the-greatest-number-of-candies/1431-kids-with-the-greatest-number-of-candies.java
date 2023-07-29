class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for(int i : candies)
            max = Math.max(i, max);
        for(int i : candies){
            if(i + extraCandies >= max)
                ans.add(true);
            else
            ans.add(false);
        }
        
        return ans;
    }
}