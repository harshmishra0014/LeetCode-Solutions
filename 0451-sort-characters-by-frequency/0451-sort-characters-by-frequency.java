class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> (b.getValue() - a.getValue())
        );
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            maxHeap.offer(entry);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for(int i = 0; i < entry.getValue(); i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}