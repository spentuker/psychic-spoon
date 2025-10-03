// Last updated: 10/3/2025, 2:13:12 PM
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        backtrack(res,new ArrayList<Integer>(),nums,0);
        List<List<Integer>> res_al=new ArrayList<>(res);
        return res_al;
    }

    void  backtrack(Set<List<Integer>> res, ArrayList<Integer> al ,int[] nums,int idx){
        // System.err.println("idx"+idx);




        if(idx==nums.length){
            // System.err.println("matching length");
            if(al.size()>=2){
                // System.err.println("Added");
                res.add(new ArrayList<>(al)); 
                // return;
            }
            return;
        }

        // if(al.size()>=1 && idx >= 1){
        //     if(nums[idx]<al.getLast())
        //         return;
        // }
        // if(nums[idx]>=al.getLast()){
           
            // System.err.println("added"+nums[idx]+"In AL");
            // System.out.println("ArrayList now "+ al);
            if(al.size()==0 || nums[idx] >= al.getLast())
            {
            al.add(nums[idx]);
            backtrack(res, al, nums, idx+1);
            al.removeLast();
            }
            backtrack(res, al, nums, idx+1);

     }

    //  boolean Inc(List<Integer> al){
    //     if(al.size()==1) return true;

    //     int prev=al.get(0);

    //     for(int i:al){
    //         if(prev>i) return false;
    //     }
        
    //     return true;
    //  }
}