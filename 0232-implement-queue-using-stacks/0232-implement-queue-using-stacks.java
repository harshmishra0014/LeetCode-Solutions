class MyQueue1 {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
//s1 top is rear of queue
    
    public MyQueue1() {
        
    }
    
    public void push(int x) {
        s1.push(x);
        
    }
    
    public int pop() {
        //move all from s1 to s2 so that s2.top is q.fron
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        int res= s2.peek();
        s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return res;
        
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        int res= s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        return res;
    }
    
    public boolean empty() {
        return s1.isEmpty();
        
    }
}

class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
//s1 top is rear of queue
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        //s2.empty means it is push ready
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
        s1.push(x);
        
    }
    
    public int pop() {
        //move all from s1 to s2 so that s2.top is q.fron
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        int res= s2.peek();
        s2.pop();
        return res;
        
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        int res= s2.peek();
        return res;
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */