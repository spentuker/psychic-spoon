// Last updated: 10/3/2025, 2:14:22 PM
class Solution {
    public int maxProduct(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        

        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                max=Math.max(prod,max);
            }
            // System.out.println("prod is " +prod);
            
        }
        return max;
    }
}