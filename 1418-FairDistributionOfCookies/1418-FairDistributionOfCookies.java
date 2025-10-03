// Last updated: 10/3/2025, 2:12:26 PM
class Solution {
    int unfair=Integer.MAX_VALUE;   
    // int n;
    public int distributeCookies(int[] cookies, int k) {
       

       int children[]=new int[k];
        int n=cookies.length;
       backtrack(children,cookies,k,0,n);

       return unfair;
       
    }

    void backtrack(int[] children,int[] cookies,int k,int idx, int n){
    // if(n==1) return cookies[0];

    if(idx>=n){
        int max=0;
        for(int a:children){
            // System.out.println(a);
            max=Math.max(a,max);
            //System.out.println("unfair rn:"+unfair);
        }
        unfair=Math.min(unfair,max);
        return;
    }

    int cookie=cookies[idx];

    for(int i=0;i<k;i++){
        if(children[i]+cookie>=unfair) continue;
        children[i]+=cookie;
        backtrack(children,cookies,k,idx+1,n);
        children[i]-=cookie;
    }
        
}
}