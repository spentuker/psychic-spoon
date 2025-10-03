// Last updated: 10/3/2025, 2:13:15 PM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();   
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
            (a,b)-> b.getValue()-a.getValue());
        
        pq.addAll(hm.entrySet());

        StringBuilder sb=new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> e=pq.poll();
            int val=e.getValue();
            char c=e.getKey();
            for(int j=0;j<val;j++){
                sb.append(c);
            }
        }

        return sb.toString();
    }   
}