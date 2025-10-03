// Last updated: 10/3/2025, 2:13:29 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0) return false;
        if(n==1) return true;
        // int a[]=new int[n];
        while(n%3==0){
            // if(n==3) return true;
            n=n/3;
        }
        return n==1;
        // if(a[n/3])
    }
}