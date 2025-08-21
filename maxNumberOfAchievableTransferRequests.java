public class maxNumberOfAchievableTransferRequests {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int res = sol.maximumRequests(5,new int[][]{{1,0},{0,1},{1,2},{2,0},{3,4}});
        System.out.println(res);
    }
    

}
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
