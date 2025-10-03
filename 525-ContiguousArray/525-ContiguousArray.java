// Last updated: 10/3/2025, 2:13:08 PM
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
            //System.out.println("Happening at i= "+i+"For value of c="+c+"Now len= "+len);
            //System.err.println(samosa);
        }
       else{
        if(nums[i]==1){
            //System.err.println("1 triggered at "+i);
            samosa.put(c,i);
            //System.out.println(samosa);
        }
        else{
            //System.err.println("0 detected at "+i);
            samosa.put(c,i);
           // System.err.println(samosa);
        }

        }
       
      
    }
     return len;
}
}
