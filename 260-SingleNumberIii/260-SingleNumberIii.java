// Last updated: 10/3/2025, 2:13:41 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        int i=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                res[i]=e.getKey();i++;
            }
        }
        return res;
    }
}