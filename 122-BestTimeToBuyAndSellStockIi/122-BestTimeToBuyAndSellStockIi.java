// Last updated: 10/3/2025, 2:14:33 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int diff=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else{
                
                if(prices[i]-min>0){
                    profit+=prices[i]-min;
                    // duur na jaaa
                    min=prices[i];
                }

            }
            
            // if()
        }
        return profit;
    }
}