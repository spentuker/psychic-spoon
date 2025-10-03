// Last updated: 10/3/2025, 2:12:15 PM
class Solution {
    int res;
    // int a[];
    public int maximumRequests(int n, int[][] requests) {
        int []a=new int[n];
        backtrack(requests,0,0,a);
        return res;
        // backtrack(requests,1,1)
        // backtrack(int[][] requests,int n,int idx)

    }
    void backtrack(int[][] requests,int idx,int count,int[] a){
        if(idx==requests.length){
            if(check(a)){
                res=Math.max(count,res);
            }
            return;
        }
        int[] req=requests[idx];
        a[req[0]]++;
        a[req[1]]--;
        backtrack(requests,idx+1,count+1,a);

        a[req[0]]--;
        a[req[1]]++;
        backtrack(requests,idx+1,count,a);

    }

    boolean check(int[] a){
        for(int i:a){
            if(i!=0) return false;
        }
        return true;
    }
}