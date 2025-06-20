// import java.util.HashMap;
import java.util.*;

class Solution{
    int findMaxLength(int[] nums){
        int i=0;
        int j=nums.length-1;
        int fromStart=findMaxLengthHelper(nums,i);
        int fromEnd=findMaxLengthHelper(nums,j);

        System.err.println(fromEnd);
        System.err.println(fromStart);

        return Math.max(fromStart,fromEnd);
    }
    int findMaxLengthHelper(int[] nums,int i){

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int k:nums){
            hm.put(k,hm.getOrDefault(k,0)+1);
        }

        if(hm.size()==1) return 0;

        int oneC=hm.get(1);
        int zeroC=hm.get(0);
        // int i=0;
        if(i==0){
        while(oneC!=zeroC){
            hm.put(nums[i],hm.get(nums[i])-1);
            i++;
            oneC=hm.get(1);
            zeroC=hm.get(0);
        }
        }
        else{
            while(oneC!=zeroC){
            hm.put(nums[i],hm.get(nums[i])-1);
            i--;
            oneC=hm.get(1);
            zeroC=hm.get(0);
        }
        }

        return oneC+zeroC;

    }
}
















public class contiArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] testCases = {
            {0, 1},                    // Expected: 2
            {0, 1, 0},                 // Expected: 2
            {0, 0, 1, 0, 0, 0, 1, 1},  // Expected: 6
            {0, 1, 1},                 // Expected: 2
            {1, 1, 1, 1},              // Expected: 0
            {0, 0, 0, 0},              // Expected: 0
            {0, 1, 1, 0, 1, 1, 1, 0},  // Expected: 4
            {0, 1, 0, 1, 0, 1, 0},     // Expected: 6
            {1, 0, 1, 0, 1, 0, 1, 0},  // Expected: 8 (fully balanced)
            {1, 1, 0, 0, 1, 0}         // Expected: 6 (entire array balanced)
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = sol.findMaxLength(testCases[i]);
            System.out.println("Test Case " + (i + 1) + " Output: " + result);
        }
    }
}
