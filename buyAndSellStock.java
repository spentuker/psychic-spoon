import java.util.*;

class buyAndSellStock{
    public static void main(String[] args){
        Solution s=new Solution();
        int res=s.maxProfit(new int[]{7,1,2,3,5,6});
        System.out.println(res);
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0;
        int min=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            System.out.println(min=Math.min(min,prices[i]));
            diff=Math.max(diff,prices[i]-min);
        }
        return diff;
    }
}