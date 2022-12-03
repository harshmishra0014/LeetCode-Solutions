class Solution {
    public int firstUniqChar(String s) 
    {
        Map<Character,Integer> d=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {   
            if(!d.containsKey(s.charAt(i)))
                d.put(s.charAt(i),1);
            else
                d.put(s.charAt(i),d.get(s.charAt(i))+1);
                
        }
         // Set<Character> ss=d.keySet();
         //    for(char c:ss)
         //        System.out.println(c+":"+d.get(c));
        for(int i=0;i<s.length();i++)
        {
            if (d.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}