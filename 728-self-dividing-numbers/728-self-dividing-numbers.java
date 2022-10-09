class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int t,r;
        boolean flag;
        for (int i=left; i<=right;i++)
        {
            if(i<=9)
                a.add(i);
            else
            {
                t=i;
                flag=true;
                while(t>0)
                {
                    r=t%10;
                    
                    if(r==0 || i%r!=0 )
                    {
                        flag=false;
                        break;
                    }
                    t=t/10;
                }
                if(flag)
                    a.add(i);
            }
        }
        return a;
    }
}