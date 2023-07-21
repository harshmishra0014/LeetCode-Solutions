class MyCircularQueue {
    int[] a;
    int capacity;
    int rear=-1,front=-1;

    public MyCircularQueue(int k) {
        this.capacity=k;
        a=new int[capacity];
    }
    
    public boolean enQueue(int value) {
        if((rear+1)%capacity==front)        //queue is full
            return false;
        
        if(front==-1)   front=0;            //first insertion
        rear=(rear+1)%capacity;
        a[rear]=value;
        return true;
    }
        
    public boolean deQueue() {
        if(front==-1)                       //queue empty
            return false;
        if(front == rear)   
            front=rear=-1;                  //only one element
        else
            front=(front+1)%capacity;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        else
            return a[front];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        else
            return a[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1)                       //queue empty
            return true;
        else
            return false;
    }
    
    public boolean isFull() {
        if((rear+1)%capacity==front)        //queue is full
            return true;
        else
            return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */