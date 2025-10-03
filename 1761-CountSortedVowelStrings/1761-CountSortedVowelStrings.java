// Last updated: 10/3/2025, 2:12:12 PM
class Solution {
    int res=0;
    public int countVowelStrings(int n) {
        
        List<Character> lst=new ArrayList<>(Arrays.asList('a','e','i','o','u'));

        bt(lst,0,n,0);
        return res;
    }
    void bt(List<Character> lst,int idx,int n,int len){
        if(len==n){
            res++;
            return;
        }
        for(int i=idx;i<lst.size();i++){
            len++;
            bt(lst,i,n,len);
            len--;
        }
    }
}