// Last updated: 10/3/2025, 2:12:53 PM
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
           // System.out.println(s);
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