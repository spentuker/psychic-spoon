// Last updated: 10/3/2025, 2:14:02 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();

        for(int a: nums){
             hm.put(a,hm.getOrDefault(a,0)+1);
             if(hm.get(a)>1) return true;
        }
        return false;
    }
}