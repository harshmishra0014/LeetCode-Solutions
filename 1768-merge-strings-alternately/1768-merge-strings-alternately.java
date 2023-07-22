class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String answer="";
        while(i<word1.length() && j<word2.length()){
            answer = answer + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length()){
            answer += word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            answer += word2.charAt(j);
            j++;
        }
        return answer;
    }
}