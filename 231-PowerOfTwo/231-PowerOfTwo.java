// Last updated: 10/3/2025, 2:13:49 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0 && (n&(n-1)) ==0) return true;
        return false;
    }
}