class FrontMiddleBackQueue {
    Stack<Integer> s1;    //main stack top of stack is back
    
    Stack<Integer> s2;    //auxillary stack top of stack is front

    public FrontMiddleBackQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void pushFront(int val) {
        //transferring all elements from s1 to s2 so that top of s2 is front
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.push(val);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }  
    }
    
    public void pushMiddle(int val) {
        int mid=s1.size()/2;
        while(s1.size()>mid){
            s2.push(s1.pop());
        }
        s1.push(val);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }  
    }
    
    public void pushBack(int val) {
        s1.push(val);
    }
    
    public int popFront() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans=s2.isEmpty()?-1:s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }  
        return ans;
    }
    
    public int popMiddle() {
        int size=s1.size();
        int mid=size/2;
        int ans=0;
        while(mid<s1.size()){
            s2.push(s1.pop());
        }
        if((size&1)==1)         // if odd pop from s2
            ans=s2.isEmpty() ? -1: s2.pop();
        else                    // if even pop from s1
            ans=s1.isEmpty() ? -1: s1.pop();
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }  
      return ans;  
    }
    
    public int popBack() {
        int ans=s1.isEmpty() ? -1: s1.pop();
        return ans;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */