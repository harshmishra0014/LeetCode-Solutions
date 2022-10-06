class Solution {
    int getNum(char c){
        switch (c) {
        case 'I':return 1;
        case 'V':return 5;
        case 'X':return 10;
        case 'L':return 50;
        case 'C':return 100;
        case 'D':return 500;
        case 'M':return 1000;
    
        }
        return 0;
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i =0;i<s.length()-1;i++){
            int currNum = getNum(s.charAt(i));
            int nextNum = getNum(s.charAt(i+1));
            
            if(currNum>=nextNum)
                sum+=currNum;
            else
                sum-=currNum;
        }
        return sum+getNum(s.charAt(s.length()-1));
    }
}