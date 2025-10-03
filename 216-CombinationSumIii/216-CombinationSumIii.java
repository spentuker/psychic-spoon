// Last updated: 10/3/2025, 2:13:53 PM
class Solution {
    List<List<Integer>> res;
    boolean checked[] = new boolean[10];
    public List<List<Integer>> combinationSum3(int k, int n) {
        res=new ArrayList<>();
        backtrack(k,n,0,new ArrayList<>(),0,1);
        return res;
    }
    void backtrack(int k,int t,int idx,ArrayList<Integer> al,int sum,int s){
        if(sum>t){
            return;
        }
        if(idx==k){
            if(sum==t){
            //  for(int i:al){
            //     checked[i]=true;
            //  }
             res.add(new ArrayList<>(al));
            }
            return;
        }
        for(int i=s;i<=9;i++){
            if(checked[i]==true) continue;
            al.add(i);
            // sum+=i;
            checked[i]=true;
            backtrack(k,t,idx+1,al,sum+i,i+1);
            al.removeLast();
            checked[i]=false;

        }
    }
}