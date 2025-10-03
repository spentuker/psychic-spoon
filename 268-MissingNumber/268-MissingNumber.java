// Last updated: 10/3/2025, 2:13:40 PM
class Solution {
    public static int missingNumber(int[] nums) {
        int l=nums.length;

        int a[]=new int[l+1];
        for(int i:nums){
            a[i]=i;
        }

        for(int i=0;i<l+1;i++){
            
            if(a[i]-i!=0){
                return i;
            }
        }

    return 0;
    }
}