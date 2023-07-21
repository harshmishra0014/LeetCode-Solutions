class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        String word=strs[0];
        int flag=-1;
        if(strs.length==1)
            return strs[0];
        for(int i=0;i<word.length();i++){
            String t=word.substring(0,i+1);
            for(int j=1;j<strs.length;j++){
                String w=strs[j];
                if(w.indexOf(t)==0)
                    flag=1;
                else{
                    flag=-1;
                    break;
                }
            }
            if(flag!=-1)
                s=t;
        }
        return s;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}