// Last updated: 10/3/2025, 2:13:24 PM
class Solution {
    public static String reverseVowels(String s) {
        int l = s.length();

       HashSet<Character> hs=new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        Stack<Character> st=new Stack<>();
       for(int i=0;i<l;i++){
        if(hs.contains(s.charAt(i))){
            st.add(s.charAt(i));
        }
       }
    String s1="";
        for(int i=0;i<l;i++){
            if(hs.contains(s.charAt(i))){
                 s1=s1+st.pop();
            }  
            else{ 
              s1= s1+s.charAt(i);}
        }
       
        //s1=s1.trim();
        //System.out.println("Char"+s1.substring(1, l+1));
        return s1; 
    }
}