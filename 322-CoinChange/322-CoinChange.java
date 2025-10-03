// Last updated: 10/3/2025, 2:13:32 PM
class Solution {
    int min=Integer.MAX_VALUE;
    int[][] memo;
    public int coinChange(int[] coins, int amount) {
        memo=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++)
            Arrays.fill(memo[i],-1);
        
        int res=bt(amount,coins,0);
        return res==1e9?-1:res;
    }

    int bt(int tar,int[] coins,int idx){
        if(tar==0)
            return 0; //in cases where the 'take' call reaches 
        if(tar<0){
            return (int)1e9;
        }
        if(memo[idx][tar]!=-1){
            return memo[idx][tar];
        }
       

        if(idx==coins.length-1){
            if(tar%coins[idx]==0){
                return tar/coins[idx];
            }
            else{
                return (int)1e9;
            }
        }

        int take=1+bt(tar-coins[idx],coins,idx);
        int not_take=0+bt(tar,coins,idx+1);

        return memo[idx][tar]=Math.min(take,not_take);
    }
}