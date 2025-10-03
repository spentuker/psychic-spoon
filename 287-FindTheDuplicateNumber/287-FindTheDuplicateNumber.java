// Last updated: 10/3/2025, 2:13:37 PM
class Solution {
    public int findDuplicate(int[] nums) {
     int s=0;
     int f=0;
    //  s=nums[s];
    //  f=nums[nums[f]];
     
    do{
        s=nums[s];
        f=nums[nums[f]];
     }while(s!=f);

     s=0;
     
     while(s!=f){
        s=nums[s];
        f=nums[f];
     }

     return s;
    
    }
}