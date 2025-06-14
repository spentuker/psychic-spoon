import java.util.*;

public class jumpGame {
    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 3, 1, 1, 4};  // Expected: true
        // int[] nums= {1,1,0,0,3,4};
        Solution sol = new Solution();
        boolean result = sol.canJump(nums);
        System.out.println(result);
    }
}

class Solution{
    boolean canJump(int[] nums){
        // int maxJ=Integer.MIN_VALUE;
        // int cur_end=0;
        // int cur_end=maxJ;
        // if(cur_end==0 && nums.length>1) return false;
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
        int cur_end=nums[0];
        int maxJ=nums[0];
        for(int i=1;i<nums.length-1;i++){
        
            // System.out.println("Max rn"+ maxJ);
            // System.out.println("cur_end: " +cur_end);
            // maxJ=Math.max(maxJ,nums[i]);
            if(nums[i]>=maxJ){
                // System.out.println(nums[i]+">"+maxJ);
                maxJ=nums[i];
                cur_end=maxJ+i;

            }
            // 1,0,1,4
            if(cur_end==i){
                cur_end=nums[i]+i;
                // System.out.println(cur_end+"="+i);
                // maxJ=nums[i];
            }
            if(cur_end<=i){
                // System.out.println("cur end:"+cur_end+"i "+i);
                return false;
            }
            maxJ--;
            if(cur_end>=nums.length-1){
                return true;
            }

        }
        return true;
    }
}

