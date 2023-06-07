class Solution {
    ArrayList<String> ans=new ArrayList<String>();
    public List<String> readBinaryWatch(int turnedOn) {
        ans.clear();
        search(0,turnedOn,0,0);
        return ans;
        
    }
    public void search(int i,int t,int h,int m){
        if(t==0){
            String s=String.valueOf(h)+":";
            if(m<10)    s+="0";
            s+=String.valueOf(m);
            ans.add(s);
        }
        else if(i==10){
            
        }
        else{
            search(i+1,t,h,m);
            if(i<4)
                h+=Math.pow(2,(3-i));
            else
                m+=Math.pow(2,(9-i));
            if (h<12 && m<60){
                search(i+1,t-1,h,m);
            }
        }
    }
}