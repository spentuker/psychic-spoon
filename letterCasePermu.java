import java.util.*;

public class letterCasePermu {
    public static void main(String[] args) {
        
         Solution sol = new Solution();

        // Test Case 1
        String input1 = "a1b2";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + sol.letterCasePermutation(input1));
        System.out.println();

        // Test Case 2
        String input2 = "3z4";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + sol.letterCasePermutation(input2));
        System.out.println();

        // Test Case 3
        String input3 = "12345";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + sol.letterCasePermutation(input3));
        System.out.println();

        // Test Case 4
        String input4 = "aBc";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + sol.letterCasePermutation(input4));
        System.out.println();
    }

}
class Solution {
    public List<String> letterCasePermutation(String s) {
        Set<String> res=new HashSet<>();
        backtrack(s,0,res);
        List<String> resList = new ArrayList<>();

        for(String k:res){
            resList.add(k);
        }

        return resList;
    }
    void backtrack(String s,int idx,Set<String> res){
        if(idx==s.length()){
            System.out.println(s);
            res.add(new String(s));
            return;
        } 
        char a=s.charAt(idx);
        if(!Character.isDigit(a))
            a^=32;

        
        s=s.substring(0,idx)+a+s.substring(idx+1,s.length());
        backtrack(s,idx+1,res);
        if(!Character.isDigit(a))
            a^=32;
        
        s=s.substring(0,idx)+a+s.substring(idx+1,s.length());
        backtrack(s,idx+1,res);
    }
}