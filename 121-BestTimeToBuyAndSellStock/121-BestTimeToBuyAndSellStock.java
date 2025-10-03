// Last updated: 10/3/2025, 2:14:35 PM
class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0;
        int min=Integer.MAX_VALUE;
        int diff=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else
            diff=Math.max(diff,prices[i]-min);
        }
        return diff;
    }
}