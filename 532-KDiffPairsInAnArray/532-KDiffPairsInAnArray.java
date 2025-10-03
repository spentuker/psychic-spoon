// Last updated: 10/3/2025, 2:13:06 PM

class Solution{
    public int findPairs(int a[],int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        for(int i:a){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            if(k==0){
                if(hm.get(i)>1) c++;
            }
            else{
                if(hm.containsKey(i+k)) c++;    
            }
        }
        return c;
    }
}