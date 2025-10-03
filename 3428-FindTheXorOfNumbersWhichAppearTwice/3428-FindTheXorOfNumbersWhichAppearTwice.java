// Last updated: 10/3/2025, 2:11:42 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()==2) al.add(e.getKey());
        }

        int res=0;

        for(int n:al){
            res^=n;
        }
        return res;
    }
}