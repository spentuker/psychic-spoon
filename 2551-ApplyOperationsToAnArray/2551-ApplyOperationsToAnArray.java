// Last updated: 10/3/2025, 2:11:51 PM
class Solution {
    public static int[] applyOperations(int[] nums) {
        int p1 = 0, p2 = 1;
        int l = nums.length;
        int z_c = 0;

        while (p2 < l) {
            if (nums[p1] == nums[p2]) {
                nums[p1] *= 2;
                nums[p2] = 0;
                z_c++;
            }
            p1++; p2++;
        }
        int[] nums1 = new int[l];
        int p = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums1[p] = nums[i];
                p++;
            }
        }
        //System.out.println(z_c);
        for (int i = 0; i < z_c; i++) {
            nums1[l-1-i] = 0;
        }
        return nums1;
    }
}