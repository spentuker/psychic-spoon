// import java.util.HashMap;
import java.util.*;

class Solution{
    int findMaxLength(int[] nums){

        HashMap<Integer,Integer> samosa=new HashMap<>();
        int c=0;
        int len=0;
        samosa.put(0,-1);
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1) c=c+1;
        else c=c-1;
        if(samosa.containsKey(c)){
            len=Math.max(len,i-samosa.get(c));
            System.out.println("Happening at i= "+i+"For value of c="+c+"Now len= "+len);
            System.err.println(samosa);
        }
       else{
        if(nums[i]==1){
            System.err.println("1 triggered at "+i);
            samosa.put(c,i);
            System.out.println(samosa);
        }
        else{
            System.err.println("0 detected at "+i);
            samosa.put(c,i);
            System.err.println(samosa);
        }

        }
       
      
    }
     return len;
}
}
















public class contiArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] testCases = {
            // {0, 1},       // Expected: 2 1
            // {0,1,1,1,1,1,0,0,0}        
            // {0, 1, 0},                     // Expected: 2 2
            {0, 0, 1, 0, 0, 0, 1, 1},  // Expected: 6 3
            // {0, 1, 1},                 // Expected: 2 4
            {1, 1, 1, 1},              // Expected: 0 5
            // {0, 0, 0, 0},              // Expected: 0 6 
            // {0, 1, 1, 0, 1, 1, 1, 0},  // Expected: 4 7
            // {0, 1, 0, 1, 0, 1, 0},     // Expected: 6 8
            {1, 0, 1, 0, 1, 0, 1, 0},  // Expected: 8 (fully balanced) 9
            {1, 1, 0, 0, 1, 0}         // Expected: 6 (entire array balanced) 10
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = sol.findMaxLength(testCases[i]);
            System.out.println("Test Case " + (i + 1) + " Output: " + result);
        }
    }
}
