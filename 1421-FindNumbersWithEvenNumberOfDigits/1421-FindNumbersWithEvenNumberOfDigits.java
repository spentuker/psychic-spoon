// Last updated: 10/3/2025, 2:12:25 PM
class Solution {
    public int countNos(int a){
        int n=0;
        while(a>0){
            a=a/10;
            n++;
        }
        return n;
    }
    public int findNumbers(int[] nums) {
        int c=0;
       for (int i: nums){
            if (countNos(i)%2==0) c++;
       }
       return c;
    }
}