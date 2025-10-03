// Last updated: 10/3/2025, 2:13:26 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
}