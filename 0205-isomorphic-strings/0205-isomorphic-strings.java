class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        // if length not equal
        if(s.length() != t.length())
            return false;
    
        else
        {
            HashMap <Character, Character> map = new HashMap<>();
        
            for(int i=0;i<s.length();i++)
            {
                if(map.containsKey(s.charAt(i)))
                {
                    if(map.get(s.charAt(i)) != t.charAt(i))
                        return false;
                }
                else
                {
                    if(map.containsValue(t.charAt(i)) == false)
                        map.put(s.charAt(i), t.charAt(i)); 
                
                    else
                        return false;
                }
            }    
            return true; 
        }
    }
}