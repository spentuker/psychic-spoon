public class sixNintyEight {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;

        Solution solution = new Solution();
        boolean result = solution.canPartitionKSubsets(nums, k);
        System.out.println("Can partition: " + result);
    }
}

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        List<List<Integet>> subsets = new ArrayList<>();
        subsetMaker(nums,k,subsets);
    }

    void subsetMaker(int[] nums,int k,List<List<Integer> >subsets){
        if(subsets.size()==k) return;
        s=
    }
    
}
