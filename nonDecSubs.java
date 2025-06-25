import java.util.*;

public class nonDecSubs {
 public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 6, 7, 7}; // Sample input
        System.err.println("Enting Function....");
        List<List<Integer>> result = solution.findSubsequences(nums);
        System.err.println("Done w Function.");
        // Printing the result
        for (List<Integer> seq : result) {
            System.out.println(seq);
        }
    }
}

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<Integer>(),nums,0);
        return res;
    }

    void  backtrack(List<List<Integer>> res, ArrayList<Integer> al ,int[] nums,int idx){
        System.err.println("idx"+idx);




        if(idx==nums.length){
            System.err.println("matching length");
            if(!(res.contains(al)) && al.size()>=2){
                System.err.println("Added");
                res.add(new ArrayList<>(al)); 
                // return;
            }
            return;
        }

        if(al.size()>=2){
            if(nums[idx]<al.getLast())
                return;
        }
        // if(nums[idx]>=al.getLast()){
            al.add(nums[idx]);
            System.err.println("added"+nums[idx]+"In AL");
            System.out.println("ArrayList now "+ al);
            backtrack(res, al, nums, idx+1);
            al.removeLast();
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