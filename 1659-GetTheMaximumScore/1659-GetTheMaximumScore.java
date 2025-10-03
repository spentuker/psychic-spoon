// Last updated: 10/3/2025, 2:12:16 PM
class Solution {
    public int maxSum(int[] nums1, int[] nums2) {

        int p1=0;int p2=0;
        long sum1=0;long sum2=0;
        long cur_sum=0;
        int mod=1_000_000_007;

        while(p1<nums1.length && p2<nums2.length){

                if(nums1[p1]<nums2[p2]){
                    sum1+=nums1[p1];p1++;

                }
                else if(nums2[p2]<nums1[p1]){
                    sum2+=nums2[p2];p2++;
                }
                else{
                    cur_sum+=Math.max(sum1,sum2)+nums1[p1];
                    p1++;p2++;
                    sum1=0;sum2=0;
                }

        }

        while (p1 < nums1.length) sum1 += nums1[p1++];
        while (p2 < nums2.length) sum2 += nums2[p2++];

        cur_sum += Math.max(sum1, sum2);


        return (int)(cur_sum % mod) ;
        
    }
}