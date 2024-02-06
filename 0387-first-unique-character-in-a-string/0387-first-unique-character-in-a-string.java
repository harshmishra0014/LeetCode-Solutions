class Solution {
    public int firstUniqChar(String s) 
    {
        Map<Character,Integer> d=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {   
            d.put(s.charAt(i), d.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<s.length();i++)
        {
            if (d.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}