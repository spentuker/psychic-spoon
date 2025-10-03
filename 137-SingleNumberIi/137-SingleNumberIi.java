// Last updated: 10/3/2025, 2:14:29 PM
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(hm.get(n)==1) return n;
        }
        return 0;

    }
}