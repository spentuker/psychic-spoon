// Last updated: 10/3/2025, 2:14:18 PM
class Solution {
    public static void rotate(int[] nums,int k){
        int l=nums.length;
        if(l<=1){
            return;
        }
        if(k>l){
        k=(k%l);}
    
        reverse(nums,0,l-1);
        reverse(nums,0,k-1);
        reverse(nums,k,l-1);
    }
    public static void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
