// Last updated: 10/3/2025, 2:14:31 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),s,0);
        return res;
    }

    void backtrack(List<List<String>> res, List<String> parti,String s,int idx){

        int n=s.length();
        System.out.println("Length of n "+ n);
        if(n==idx){
            res.add(new ArrayList<>(parti));
            return;
        }
        for(int i=idx;i<n;i++){
            System.out.println("String to be sent to pal : "+ s.substring(idx));
            System.out.println("Idx : "+ idx);
            if(isPal(s.substring(idx,i+1))){
                parti.add(s.substring(idx,i+1));
                System.out.println("Entering backtracking");
                backtrack(res,parti,s,i + 1);
                parti.removeLast();
            }
        }
    }

    boolean isPal(String s){
        System.out.println("String at eval: "+ s);
        int p1=0;
        int p2=s.length()-1;

        while(p1<p2){
            
            if(s.charAt(p1) != s.charAt(p2))
               { System.out.println(s+"is not a palindrome"); return false; }
            p1++;p2--;

        }

        return true;
    }
}