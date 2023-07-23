class Solution1 {
    //if we take xor only distinct character will be left
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(int i = 0; i < s.length(); i++){
            c ^= s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            c ^= t.charAt(i);
        }
        return c;
    }
}


class Solution {
    //if we take xor only distinct character will be left
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char ch: (s+t).toCharArray())
            c ^=ch;
        return c;
    }
}