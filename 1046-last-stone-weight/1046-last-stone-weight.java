class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.offer(i);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a==b)    continue;
            else pq.offer(Math.abs(a-b));
        }
        if(pq.size()==0) return 0;
        else return pq.peek();
    }
}