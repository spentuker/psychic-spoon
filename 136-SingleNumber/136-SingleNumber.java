// Last updated: 10/3/2025, 2:14:30 PM
class Solution {
    public int singleNumber(int[] nums) {
     int res=0;
     for(int n:nums) res^=n;

     return res;   
    }
}