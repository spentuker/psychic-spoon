    import java.util.*;

    public class findNonRep {
        public static void main(String[] args) {
            // Test cases
            int[] arr1 = {2, 3, 5, 4, 5, 3, 4};
            int[] arr2 = {10, 20, 10, 30, 20};
            int[] arr3 = {7};
            int[] arr4 = {1, 1, 2, 2, 99};
            int[] arr5 = {100, 100, 200, 300, 200};

            System.out.println("Non-repeating element in arr1: " + findNonRepeating(arr1)); // Expected: 2
            System.out.println("Non-repeating element in arr2: " + findNonRepeating(arr2)); // Expected: 30
            System.out.println("Non-repeating element in arr3: " + findNonRepeating(arr3)); // Expected: 7
            System.out.println("Non-repeating element in arr4: " + findNonRepeating(arr4)); // Expected: 99
            System.out.println("Non-repeating element in arr5: " + findNonRepeating(arr5)); // Expected: 300
        }

        static int findNonRepeating(int nums[]){
            int res=0;
            HashMap<Integer,Integer> hm=new HashMap<>();

            for(int i:nums){
                // System.out.println("Array at hand : "+ i);
                // if(hm.containsKey(i)){
                //     System.out.println("It exists so count is "+ hm.get(i));
                // }
                // else{
                //     System.err.println("It does not exxist so the count is "+ hm.get(i));
                // }

                
                hm.put(i,hm.getOrDefault(i,0)+1);
                // hm.put(i,hm.get(i)+1);

                // System.out.println("After updating, the count is "+ hm.get(i));
            }
            // System.out.println(hm);
            for(int i:hm.keySet()){
                int count=hm.get(i);
                if(count==1){
                    res=i;
                    break;
                } 
            }
            hm.clear();
            return res;
        }
    }
